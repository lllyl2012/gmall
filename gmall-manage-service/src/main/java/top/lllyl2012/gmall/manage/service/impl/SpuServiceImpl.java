package top.lllyl2012.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import top.lllyl2012.gmall.bean.PmsBaseAttrInfo;
import top.lllyl2012.gmall.bean.PmsProductInfo;
import top.lllyl2012.gmall.manage.mapper.PmsProductImageMapper;
import top.lllyl2012.gmall.manage.mapper.PmsProductInfoMapper;
import top.lllyl2012.gmall.manage.mapper.PmsProductSaleAttrMapper;
import top.lllyl2012.gmall.manage.mapper.PmsProductSaleAttrValueMapper;
import top.lllyl2012.gmall.service.SpuService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;

    @Autowired
    private PmsProductImageMapper pmsProductImageMapper;

    @Autowired
    private PmsProductSaleAttrMapper pmsProductSaleAttrMapper;

    @Autowired
    private PmsProductSaleAttrValueMapper pmsProductSaleAttrValueMapper;

    @Override
    public List<PmsProductInfo> spuList(Long catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);
        return pmsProductInfoMapper.queryPmsProductInfo(pmsProductInfo);
    }

    @Override
    @Transactional
    public String saveSpuInfo( PmsProductInfo pmsProductInfo) {
        pmsProductInfoMapper.insertPmsProductInfo(pmsProductInfo);

        Optional.ofNullable(pmsProductInfo.getSpuImageList()).orElse(new ArrayList<>()).forEach(i->{
            i.setProductId(pmsProductInfo.getId());
            pmsProductImageMapper.insertPmsProductImage(i);
        });

        Optional.ofNullable(pmsProductInfo.getSpuSaleAttrList()).orElse(new ArrayList<>()).forEach(i->{
            i.setProductId(pmsProductInfo.getId());
            pmsProductSaleAttrMapper.insertPmsProductSaleAttr(i);

            i.getSpuSaleAttrValueList().forEach(k->{
                k.setProductId(pmsProductInfo.getId());
                k.setSaleAttrId(i.getId());
                pmsProductSaleAttrValueMapper.insertPmsProductSaleAttrValue(k);
            });
        });

        return "success";
    }
}
