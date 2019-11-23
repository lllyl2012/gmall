package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsSkuImage;
/**
*  @author volume
*/
public interface PmsSkuImageBaseMapper {

    int insertPmsSkuImage(PmsSkuImage object);

    int updatePmsSkuImage(PmsSkuImage object);

    int update(PmsSkuImage.UpdateBuilder object);

    List<PmsSkuImage> queryPmsSkuImage(PmsSkuImage object);

    PmsSkuImage queryPmsSkuImageLimit1(PmsSkuImage object);

}