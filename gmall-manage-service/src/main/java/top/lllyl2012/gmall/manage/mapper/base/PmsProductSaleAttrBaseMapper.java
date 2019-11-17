package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsProductSaleAttr;
/**
*  @author volume
*/
public interface PmsProductSaleAttrBaseMapper {

    int insertPmsProductSaleAttr(PmsProductSaleAttr object);

    int updatePmsProductSaleAttr(PmsProductSaleAttr object);

    int update(PmsProductSaleAttr.UpdateBuilder object);

    List<PmsProductSaleAttr> queryPmsProductSaleAttr(PmsProductSaleAttr object);

    PmsProductSaleAttr queryPmsProductSaleAttrLimit1(PmsProductSaleAttr object);

}