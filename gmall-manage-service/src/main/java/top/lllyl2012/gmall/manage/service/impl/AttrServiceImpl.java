package top.lllyl2012.gmall.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import top.lllyl2012.gmall.bean.PmsBaseAttrInfo;
import top.lllyl2012.gmall.manage.mapper.PmsBaseAttrInfoMapper;
import top.lllyl2012.gmall.manage.mapper.PmsBaseAttrValueMapper;
import top.lllyl2012.gmall.service.AttrService;

import java.util.List;

@Service
public class AttrServiceImpl implements AttrService {

    @Autowired
    private PmsBaseAttrInfoMapper pmsBaseAttrInfoMapper;

    @Autowired
    private PmsBaseAttrValueMapper pmsBaseAttrValueMapper;

    @Override
    public List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id) {
        PmsBaseAttrInfo pmsBaseAttrInfo = new PmsBaseAttrInfo();
        pmsBaseAttrInfo.setCatalog3Id(catalog3Id);
        return pmsBaseAttrInfoMapper.queryPmsBaseAttrInfo(pmsBaseAttrInfo);
    }

    @Override
    public void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo) {
        pmsBaseAttrInfoMapper.insertPmsBaseAttrInfo(pmsBaseAttrInfo);

        pmsBaseAttrInfo.getAttrValueList().forEach(i->{
            i.setAttrId(pmsBaseAttrInfo.getId());
            pmsBaseAttrValueMapper.insertPmsBaseAttrValue(i);
        });
    }
}
