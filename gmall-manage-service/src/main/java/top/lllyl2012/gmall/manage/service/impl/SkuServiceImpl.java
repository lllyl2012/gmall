package top.lllyl2012.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import top.lllyl2012.gmall.bean.PmsSkuImage;
import top.lllyl2012.gmall.bean.PmsSkuInfo;
import top.lllyl2012.gmall.manage.mapper.PmsSkuAttrValueMapper;
import top.lllyl2012.gmall.manage.mapper.PmsSkuImageMapper;
import top.lllyl2012.gmall.manage.mapper.PmsSkuInfoMapper;
import top.lllyl2012.gmall.manage.mapper.PmsSkuSaleAttrValueMapper;
import top.lllyl2012.gmall.service.SkuService;

import java.util.ArrayList;
import java.util.Optional;

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
}
