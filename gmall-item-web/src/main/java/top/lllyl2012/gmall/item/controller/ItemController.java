package top.lllyl2012.gmall.item.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lllyl2012.gmall.bean.PmsProductSaleAttr;
import top.lllyl2012.gmall.bean.PmsSkuInfo;
import top.lllyl2012.gmall.bean.PmsSkuSaleAttrValue;
import top.lllyl2012.gmall.service.SkuService;
import top.lllyl2012.gmall.service.SpuService;

import java.util.HashMap;
import java.util.List;

@Controller
public class ItemController {

    @Reference
    private SkuService skuService;

    @Reference
    private SpuService spuService;

    @RequestMapping("{skuId}.html")
    public String item(@PathVariable String skuId, Model model) {
        PmsSkuInfo pmsSkuInfo = skuService.getSkuById(skuId);
        model.addAttribute("skuInfo", pmsSkuInfo);

        //销售属性列表
        List<PmsProductSaleAttr> pmsProductSaleAttrs = spuService.spuSaleAttrListCheckBySku(pmsSkuInfo.getProductId(),skuId);
        model.addAttribute("spuSaleAttrListCheckBySku", pmsProductSaleAttrs);

        //查询当前sku的spu的其他
        HashMap<String, Long> objectObjectHashMap = new HashMap<>();
        List<PmsSkuInfo> pmsSkuInfos = skuService.getSkuSaleAttrValueListBySpu(pmsSkuInfo.getProductId());
        for (PmsSkuInfo skuInfo : pmsSkuInfos) {
            String k = "";
            Long v = skuInfo.getId();

            List<PmsSkuSaleAttrValue> skuSaleAttrValues = skuInfo.getSkuSaleAttrValueList();

            for (PmsSkuSaleAttrValue pmsSkuSaleAttrValue : skuSaleAttrValues) {
                k += pmsSkuSaleAttrValue.getSaleAttrValueId() + "|";
            }

            objectObjectHashMap.put(k, v);
        }
        model.addAttribute("skuSaleAttrHashJsonStr",objectObjectHashMap);
        return "item";
    }

    @RequestMapping("/test")
    public String test(Model model) {
        model.addAttribute("index", "hello");
        return "index";
    }

}
