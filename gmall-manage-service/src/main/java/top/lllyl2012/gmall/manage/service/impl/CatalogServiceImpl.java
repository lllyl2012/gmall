package top.lllyl2012.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import top.lllyl2012.gmall.bean.PmsBaseCatalog1;
import top.lllyl2012.gmall.bean.PmsBaseCatalog2;
import top.lllyl2012.gmall.bean.PmsBaseCatalog3;
import top.lllyl2012.gmall.manage.mapper.PmsBaseCatalog1Mapper;
import top.lllyl2012.gmall.manage.mapper.PmsBaseCatalog2Mapper;
import top.lllyl2012.gmall.manage.mapper.PmsBaseCatalog3Mapper;
import top.lllyl2012.gmall.service.CatalogService;

import java.util.List;

@Service
public class CatalogServiceImpl implements CatalogService {

    @Autowired
    private PmsBaseCatalog1Mapper pmsBaseCatalog1Mapper;

    @Autowired
    private PmsBaseCatalog2Mapper pmsBaseCatalog2Mapper;

    @Autowired
    private PmsBaseCatalog3Mapper pmsBaseCatalog3Mapper;

    @Override
    public List<PmsBaseCatalog1> getCatalog1() {
        return pmsBaseCatalog1Mapper.queryPmsBaseCatalog1(new PmsBaseCatalog1());
    }

    @Override
    public List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id) {
        PmsBaseCatalog2 pmsBaseCatalog2 = new PmsBaseCatalog2();
        pmsBaseCatalog2.setCatalog1Id(catalog1Id);
        return pmsBaseCatalog2Mapper.queryPmsBaseCatalog2(pmsBaseCatalog2);
    }

    @Override
    public List<PmsBaseCatalog3> getCatalog3(Long catalog2Id) {
        PmsBaseCatalog3 pmsBaseCatalog3 = new PmsBaseCatalog3();
        pmsBaseCatalog3.setCatalog2Id(catalog2Id);
        return pmsBaseCatalog3Mapper.queryPmsBaseCatalog3(pmsBaseCatalog3);
    }
}
