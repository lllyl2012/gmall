package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsBaseCatalog2;
/**
*  @author volume
*/
public interface PmsBaseCatalog2BaseMapper {

    int insertPmsBaseCatalog2(PmsBaseCatalog2 object);

    int updatePmsBaseCatalog2(PmsBaseCatalog2 object);

    int update(PmsBaseCatalog2.UpdateBuilder object);

    List<PmsBaseCatalog2> queryPmsBaseCatalog2(PmsBaseCatalog2 object);

    PmsBaseCatalog2 queryPmsBaseCatalog2Limit1(PmsBaseCatalog2 object);

}