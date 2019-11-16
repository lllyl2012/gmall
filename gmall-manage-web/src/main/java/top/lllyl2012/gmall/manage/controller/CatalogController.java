package top.lllyl2012.gmall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lllyl2012.gmall.bean.*;
import top.lllyl2012.gmall.service.CatalogService;

import java.util.ArrayList;
import java.util.List;

@Controller
@CrossOrigin
public class CatalogController {

    @Reference
    private CatalogService catalogService;

    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<PmsBaseCatalog1> getCatalog1() {
        return catalogService.getCatalog1();
    }

    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id) {
        return catalogService.getCatalog2(catalog1Id);
    }

    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<PmsBaseCatalog3> getCatalog3(Long catalog2Id) {
        return catalogService.getCatalog3(catalog2Id);
    }
}
