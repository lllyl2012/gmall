package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsProductSaleAttrValue;
/**
*  @author volume
*/
public interface PmsProductSaleAttrValueBaseMapper {

    int insertPmsProductSaleAttrValue(PmsProductSaleAttrValue object);

    int updatePmsProductSaleAttrValue(PmsProductSaleAttrValue object);

    int update(PmsProductSaleAttrValue.UpdateBuilder object);

    List<PmsProductSaleAttrValue> queryPmsProductSaleAttrValue(PmsProductSaleAttrValue object);

    PmsProductSaleAttrValue queryPmsProductSaleAttrValueLimit1(PmsProductSaleAttrValue object);

}