package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsProductInfo;
/**
*  @author volume
*/
public interface PmsProductInfoBaseMapper {

    int insertPmsProductInfo(PmsProductInfo object);

    int updatePmsProductInfo(PmsProductInfo object);

    int update(PmsProductInfo.UpdateBuilder object);

    List<PmsProductInfo> queryPmsProductInfo(PmsProductInfo object);

    PmsProductInfo queryPmsProductInfoLimit1(PmsProductInfo object);

}