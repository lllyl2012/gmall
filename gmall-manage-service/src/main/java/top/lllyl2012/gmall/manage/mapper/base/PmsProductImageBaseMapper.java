package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsProductImage;
/**
*  @author volume
*/
public interface PmsProductImageBaseMapper {

    int insertPmsProductImage(PmsProductImage object);

    int updatePmsProductImage(PmsProductImage object);

    int update(PmsProductImage.UpdateBuilder object);

    List<PmsProductImage> queryPmsProductImage(PmsProductImage object);

    PmsProductImage queryPmsProductImageLimit1(PmsProductImage object);

}