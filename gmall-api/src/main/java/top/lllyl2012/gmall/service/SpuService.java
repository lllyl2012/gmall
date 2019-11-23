package top.lllyl2012.gmall.service;

import top.lllyl2012.gmall.bean.*;

import java.util.List;

public interface SpuService {
    List<PmsProductInfo> spuList(Long catalog3Id);

    String saveSpuInfo( PmsProductInfo pmsProductInfo);

    List<PmsProductSaleAttr> spuSaleAttrList(Long spuId);

    List<PmsProductImage> spuImageList(Long spuId);
}
