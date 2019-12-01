package top.lllyl2012.gmall.service;

import top.lllyl2012.gmall.bean.PmsSkuInfo;

import java.util.List;

public interface SkuService {
    void skuService(PmsSkuInfo pmsSkuInfo);

    PmsSkuInfo getSkuById(String skuId);

    List<PmsSkuInfo> getSkuSaleAttrValueListBySpu(Long productId);
}
