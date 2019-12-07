package top.lllyl2012.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import redis.clients.jedis.Jedis;
import top.lllyl2012.gmall.bean.PmsSkuImage;
import top.lllyl2012.gmall.bean.PmsSkuInfo;
import top.lllyl2012.gmall.manage.mapper.PmsSkuAttrValueMapper;
import top.lllyl2012.gmall.manage.mapper.PmsSkuImageMapper;
import top.lllyl2012.gmall.manage.mapper.PmsSkuInfoMapper;
import top.lllyl2012.gmall.manage.mapper.PmsSkuSaleAttrValueMapper;
import top.lllyl2012.gmall.service.SkuService;
import top.lllyl2012.gmall.utils.RedisUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class SkuServiceImpl implements SkuService {

    @Autowired
    private PmsSkuImageMapper pmsSkuImageMapper;

    @Autowired
    private PmsSkuInfoMapper pmsSkuInfoMapper;

    @Autowired
    private PmsSkuAttrValueMapper pmsSkuAttrValueMapper;

    @Autowired
    private PmsSkuSaleAttrValueMapper pmsSkuSaleAttrValueMapper;

    @Autowired
    private RedisUtil redisUtil;

    @Override
    public void skuService(PmsSkuInfo pmsSkuInfo) {
        pmsSkuInfoMapper.insertPmsSkuInfo(pmsSkuInfo);

        Optional.ofNullable(pmsSkuInfo.getSkuImageList()).orElse(new ArrayList<>()).forEach(i->{
            i.setSkuId(pmsSkuInfo.getId());
            pmsSkuImageMapper.insertPmsSkuImage(i);
        });

        Optional.ofNullable(pmsSkuInfo.getSkuAttrValueList()).orElse(new ArrayList<>()).forEach(i->{
            i.setSkuId(pmsSkuInfo.getId());
            pmsSkuAttrValueMapper.insertPmsSkuAttrValue(i);
        });

        Optional.ofNullable(pmsSkuInfo.getSkuSaleAttrValueList()).orElse(new ArrayList<>()).forEach(i->{
            i.setSkuId(pmsSkuInfo.getId());
            pmsSkuSaleAttrValueMapper.insertPmsSkuSaleAttrValue(i);
        });
    }

    public PmsSkuInfo getSkuByIdFromDB(String skuId) {
        Long skId = Long.parseLong(skuId);

        PmsSkuInfo pmsSkuInfo = new PmsSkuInfo();
        pmsSkuInfo.setId(skId);

        PmsSkuImage pmsSkuImage = new PmsSkuImage();
        pmsSkuImage.setSkuId(skId);
        PmsSkuInfo pmsSkuInfo1 = pmsSkuInfoMapper.queryPmsSkuInfoLimit1(pmsSkuInfo);
        List<PmsSkuImage> pmsSkuImages = pmsSkuImageMapper.queryPmsSkuImage(pmsSkuImage);
        pmsSkuInfo1.setSkuImageList(pmsSkuImages);
        return pmsSkuInfo1;
    }

    @Override
    public PmsSkuInfo getSkuById(String skuId) {
        PmsSkuInfo pmsSkuInfo;
        Jedis jedis = redisUtil.getRedis();

        //查询缓存
        String skuKey = "sku:" + skuId + ":info";
        String skuJson = jedis.get(skuKey);
        if (StringUtils.isNotEmpty(skuJson)) {
            pmsSkuInfo = JSON.parseObject(skuJson, PmsSkuInfo.class);
        }else {
            String lockKey = "sku:" + skuId + ":lock";
            //设置分布式锁
            String uuid = UUID.randomUUID().toString();
            String ok = jedis.set(lockKey, uuid, "nx", "px", 10);
            if (ok.equals("OK")) {
                pmsSkuInfo = getSkuByIdFromDB(skuId);
                if (pmsSkuInfo != null) {
                    jedis.set(skuKey, JSON.toJSONString(pmsSkuInfo));
                }else{
                    //为了防止缓存穿透,null值设置给redis
                    jedis.setex(skuKey,60*5, JSON.toJSONString(""));
                }
                String lockToken = jedis.get(lockKey);
                if (lockToken.equals(uuid)) {
                    jedis.del(lockKey);
                }
            }else{
                //设置失败，自旋（在该线程睡眠一段时间后重新反问该方法）
                pmsSkuInfo = getSkuById(skuId);
            }

        }
        jedis.close();
        return pmsSkuInfo;
    }

    @Override
    public List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(Long productId) {

        PmsSkuInfo pmsSkuInfo = new PmsSkuInfo();
        pmsSkuInfo.setProductId(productId);
        return pmsSkuInfoMapper.selectListByProjectId(pmsSkuInfo);
    }
}
