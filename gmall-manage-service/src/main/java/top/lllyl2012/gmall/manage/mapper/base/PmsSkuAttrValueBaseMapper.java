package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsSkuAttrValue;
/**
*  @author volume
*/
public interface PmsSkuAttrValueBaseMapper {

    int insertPmsSkuAttrValue(PmsSkuAttrValue object);

    int updatePmsSkuAttrValue(PmsSkuAttrValue object);

    int update(PmsSkuAttrValue.UpdateBuilder object);

    List<PmsSkuAttrValue> queryPmsSkuAttrValue(PmsSkuAttrValue object);

    PmsSkuAttrValue queryPmsSkuAttrValueLimit1(PmsSkuAttrValue object);

}