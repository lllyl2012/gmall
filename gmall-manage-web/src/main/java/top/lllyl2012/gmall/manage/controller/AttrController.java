package top.lllyl2012.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lllyl2012.gmall.bean.PmsBaseAttrInfo;
import top.lllyl2012.gmall.bean.PmsBaseAttrValue;
import top.lllyl2012.gmall.bean.PmsBaseSaleAttr;
import top.lllyl2012.gmall.service.AttrService;

import java.util.List;

@Controller
@CrossOrigin
public class AttrController {

    @Reference
    private AttrService attrService;

    @RequestMapping("/attrInfoList")
    @ResponseBody
    public List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id) {
        return attrService.attrInfoList(catalog3Id);
    }

    @RequestMapping("/saveAttrInfo")
    @ResponseBody
    public String saveAttrInfo(@RequestBody PmsBaseAttrInfo pmsBaseAttrInfo) {
        attrService.saveAttrInfo(pmsBaseAttrInfo);
        return "success";
    }

    @RequestMapping("/getAttrValueList")
    @ResponseBody
    public List<PmsBaseAttrValue> getAttrValueList(PmsBaseAttrValue pmsBaseAttrValue) {
        return attrService.getAttrValueList(pmsBaseAttrValue);
    }

    @RequestMapping("/baseSaleAttrList")
    @ResponseBody
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return attrService.baseSaleAttrList();
    }

}
