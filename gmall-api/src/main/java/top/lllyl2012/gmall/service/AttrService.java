package top.lllyl2012.gmall.service;

import top.lllyl2012.gmall.bean.PmsBaseAttrInfo;
import top.lllyl2012.gmall.bean.PmsBaseAttrValue;

import java.util.List;

public interface AttrService {
    List<PmsBaseAttrInfo> attrInfoList(Long catalog3Id);

    void saveAttrInfo(PmsBaseAttrInfo pmsBaseAttrInfo);

    List<PmsBaseAttrValue> getAttrValueList(PmsBaseAttrValue pmsBaseAttrValue);
}
