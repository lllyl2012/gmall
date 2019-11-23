package top.lllyl2012.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import top.lllyl2012.gmall.bean.PmsBaseAttrInfo;
import top.lllyl2012.gmall.bean.PmsBaseAttrValue;
import top.lllyl2012.gmall.bean.PmsBaseSaleAttr;
import top.lllyl2012.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import top.lllyl2012.gmall.manage.mapper.PmsBaseAttrValueMapper;
import top.lllyl2012.gmall.manage.mapper.PmsBaseSaleAttrMapper;
import top.lllyl2012.gmall.service.AttrService;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Autowired
    private PmsBaseSaleAttrMapper pmsBaseSaleAttrMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        List<PmsBaseAttrInfo> pmsBaseAttrInfos = pmsBaseAttrInfoMapper.queryPmsBaseAttrInfo(pmsBaseAttrInfo);
        pmsBaseAttrInfos.forEach(i->{
            PmsBaseAttrValue pmsBaseAttrValue = new PmsBaseAttrValue();
            pmsBaseAttrValue.setAttrId(i.getId());
            i.setAttrValueList(pmsBaseAttrValueMapper.queryPmsBaseAttrValue(pmsBaseAttrValue));
        });
        return pmsBaseAttrInfos;
    }

    @Override
    public void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        if (pmsBaseAttrInfo.getId() == null) {
            pmsBaseAttrInfoMapper.insertPmsBaseAttrInfo(pmsBaseAttrInfo);
        }else {
            pmsBaseAttrInfoMapper.updatePmsBaseAttrInfo(pmsBaseAttrInfo);
            pmsBaseAttrValueMapper.deleteByAttrId(pmsBaseAttrInfo.getId());
        }
        pmsBaseAttrInfo.getAttrValueList().forEach(i->{
            i.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.insertPmsBaseAttrValue(i);
        });
    }

    @Override
    public List<PmsBaseAttrValue> getAttrValueList(PmsBaseAttrValue pmsBaseAttrValue) {
        return pmsBaseAttrValueMapper.queryPmsBaseAttrValue(pmsBaseAttrValue);
    }

    @Override
    public List<PmsBaseSaleAttr> baseSaleAttrList() {
        return pmsBaseSaleAttrMapper.queryPmsBaseSaleAttr(new PmsBaseSaleAttr());
    }
}
