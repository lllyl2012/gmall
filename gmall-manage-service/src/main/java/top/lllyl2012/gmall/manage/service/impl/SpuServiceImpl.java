package top.lllyl2012.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import top.lllyl2012.gmall.bean.*;
import top.lllyl2012.gmall.manage.mapper.*;
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
                k.setSaleAttrId(i.getSaleAttrId());
                pmsProductSaleAttrValueMapper.insertPmsProductSaleAttrValue(k);
            });
        });

        return "success";
    }

    @Override
    public List<PmsProductSaleAttr> spuSaleAttrList(Long spuId) {
        PmsProductSaleAttr pmsProductSaleAttr = new PmsProductSaleAttr();
        pmsProductSaleAttr.setProductId(spuId);
        List<PmsProductSaleAttr> pmsProductSaleAttrs = pmsProductSaleAttrMapper.queryPmsProductSaleAttr(pmsProductSaleAttr);
        pmsProductSaleAttrs.forEach(i->{
            PmsProductSaleAttrValue pmsProductSaleAttrValue = new PmsProductSaleAttrValue();
            pmsProductSaleAttrValue.setSaleAttrId(i.getSaleAttrId());
            pmsProductSaleAttrValue.setProductId(spuId);
           i.setSpuSaleAttrValueList(pmsProductSaleAttrValueMapper.queryPmsProductSaleAttrValue(pmsProductSaleAttrValue));
        });
        return pmsProductSaleAttrs;
    }

    @Override
    public List<PmsProductImage> spuImageList(Long spuId) {
        PmsProductImage pmsProductImage = new PmsProductImage();
        pmsProductImage.setProductId(spuId);
        return pmsProductImageMapper.queryPmsProductImage(pmsProductImage);
    }

    @Override
    public List<PmsProductSaleAttr> spuSaleAttrListCheckBySku(Long productId,String skuId) {
//        PmsProductSaleAttr pmsProductSaleAttr = new PmsProductSaleAttr();
//        pmsProductSaleAttr.setProductId(productId);
//        List<PmsProductSaleAttr> pmsProductSaleAttrs = pmsProductSaleAttrMapper.queryPmsProductSaleAttr(pmsProductSaleAttr);
//
//        for (PmsProductSaleAttr pmsProductSaleAttr1 : pmsProductSaleAttrs ) {
//            Long saleAttrId = pmsProductSaleAttr1.getSaleAttrId();
//
//            PmsProductSaleAttrValue pmsProductSaleAttrValue = new PmsProductSaleAttrValue();
//            pmsProductSaleAttrValue.setSaleAttrId(saleAttrId);
//            pmsProductSaleAttrValue.setProductId(productId);
//            List<PmsProductSaleAttrValue> pmsProductSaleAttrValues = pmsProductSaleAttrValueMapper.queryPmsProductSaleAttrValue(pmsProductSaleAttrValue);
//
//            pmsProductSaleAttr1.setSpuSaleAttrValueList(pmsProductSaleAttrValues);
//        }

        List<PmsProductSaleAttr> pmsProductSaleAttrs = pmsProductSaleAttrMapper.selectSpuSaleAttrListCheckBySku(productId, skuId);

        return pmsProductSaleAttrs;
    }
}
