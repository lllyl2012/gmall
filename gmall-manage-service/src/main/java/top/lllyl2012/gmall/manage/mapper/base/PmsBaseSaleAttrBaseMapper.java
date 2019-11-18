package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsBaseSaleAttr;
/**
*  @author volume
*/
public interface PmsBaseSaleAttrBaseMapper {

    int insertPmsBaseSaleAttr(PmsBaseSaleAttr object);

    int updatePmsBaseSaleAttr(PmsBaseSaleAttr object);

    int update(PmsBaseSaleAttr.UpdateBuilder object);

    List<PmsBaseSaleAttr> queryPmsBaseSaleAttr(PmsBaseSaleAttr object);

    PmsBaseSaleAttr queryPmsBaseSaleAttrLimit1(PmsBaseSaleAttr object);

}