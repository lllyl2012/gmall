package top.lllyl2012.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import top.lllyl2012.gmall.bean.PmsProductInfo;
import top.lllyl2012.gmall.manage.mapper.PmsProductInfoMapper;
import top.lllyl2012.gmall.service.SpuService;

import java.util.List;

@Service
public class SpuServiceImpl implements SpuService {

    @Autowired
    private PmsProductInfoMapper pmsProductInfoMapper;

    @Override
    public List<PmsProductInfo> spuList(Long catalog3Id) {
        PmsProductInfo pmsProductInfo = new PmsProductInfo();
        pmsProductInfo.setCatalog3Id(catalog3Id);
        return pmsProductInfoMapper.queryPmsProductInfo(pmsProductInfo);
    }
}
