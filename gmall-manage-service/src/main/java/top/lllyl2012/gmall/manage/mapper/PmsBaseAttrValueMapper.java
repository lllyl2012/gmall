package top.lllyl2012.gmall.manage.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsBaseAttrValue;
import top.lllyl2012.gmall.manage.mapper.base.PmsBaseAttrValueBaseMapper;
/**
*  @author volume
*/
public interface PmsBaseAttrValueMapper extends PmsBaseAttrValueBaseMapper {

    @Delete("delete from pms_base_attr_value where attr_id = #{attrId}")
    Integer deleteByAttrId(@Param("attrId") Long attrId);
}