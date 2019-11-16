package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsBaseAttrInfo;
/**
*  @author volume
*/
public interface PmsBaseAttrInfoBaseMapper {

    int insertPmsBaseAttrInfo(PmsBaseAttrInfo object);

    int updatePmsBaseAttrInfo(PmsBaseAttrInfo object);

    int update(PmsBaseAttrInfo.UpdateBuilder object);

    List<PmsBaseAttrInfo> queryPmsBaseAttrInfo(PmsBaseAttrInfo object);

    PmsBaseAttrInfo queryPmsBaseAttrInfoLimit1(PmsBaseAttrInfo object);

}