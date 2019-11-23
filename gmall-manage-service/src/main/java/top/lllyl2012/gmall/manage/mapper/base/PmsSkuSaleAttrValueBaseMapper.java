package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsSkuSaleAttrValue;
/**
*  @author volume
*/
public interface PmsSkuSaleAttrValueBaseMapper {

    int insertPmsSkuSaleAttrValue(PmsSkuSaleAttrValue object);

    int updatePmsSkuSaleAttrValue(PmsSkuSaleAttrValue object);

    int update(PmsSkuSaleAttrValue.UpdateBuilder object);

    List<PmsSkuSaleAttrValue> queryPmsSkuSaleAttrValue(PmsSkuSaleAttrValue object);

    PmsSkuSaleAttrValue queryPmsSkuSaleAttrValueLimit1(PmsSkuSaleAttrValue object);

}