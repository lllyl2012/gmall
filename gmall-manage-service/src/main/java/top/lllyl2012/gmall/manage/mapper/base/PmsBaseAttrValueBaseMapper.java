package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsBaseAttrValue;
/**
*  @author volume
*/
public interface PmsBaseAttrValueBaseMapper {

    int insertPmsBaseAttrValue(PmsBaseAttrValue object);

    int updatePmsBaseAttrValue(PmsBaseAttrValue object);

    int update(PmsBaseAttrValue.UpdateBuilder object);

    List<PmsBaseAttrValue> queryPmsBaseAttrValue(PmsBaseAttrValue object);

    PmsBaseAttrValue queryPmsBaseAttrValueLimit1(PmsBaseAttrValue object);

}