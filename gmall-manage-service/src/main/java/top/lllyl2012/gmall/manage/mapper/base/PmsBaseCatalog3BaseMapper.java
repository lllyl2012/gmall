package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsBaseCatalog3;
/**
*  @author volume
*/
public interface PmsBaseCatalog3BaseMapper {

    int insertPmsBaseCatalog3(PmsBaseCatalog3 object);

    int updatePmsBaseCatalog3(PmsBaseCatalog3 object);

    int update(PmsBaseCatalog3.UpdateBuilder object);

    List<PmsBaseCatalog3> queryPmsBaseCatalog3(PmsBaseCatalog3 object);

    PmsBaseCatalog3 queryPmsBaseCatalog3Limit1(PmsBaseCatalog3 object);

}