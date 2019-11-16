package top.lllyl2012.gmall.service;

import top.lllyl2012.gmall.bean.PmsBaseCatalog1;
import top.lllyl2012.gmall.bean.PmsBaseCatalog2;
import top.lllyl2012.gmall.bean.PmsBaseCatalog3;

import java.util.List;

public interface CatalogService {
    List<PmsBaseCatalog1> getCatalog1();

    List<PmsBaseCatalog2> getCatalog2(Integer catalog1Id);

    List<PmsBaseCatalog3> getCatalog3(Long catalog2Id);
}
