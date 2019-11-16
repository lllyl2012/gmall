package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsBaseCatalog1;
/**
*  @author volume
*/
public interface PmsBaseCatalog1BaseMapper {

    int insertPmsBaseCatalog1(PmsBaseCatalog1 object);

    int updatePmsBaseCatalog1(PmsBaseCatalog1 object);

    int update(PmsBaseCatalog1.UpdateBuilder object);

    List<PmsBaseCatalog1> queryPmsBaseCatalog1(PmsBaseCatalog1 object);

    PmsBaseCatalog1 queryPmsBaseCatalog1Limit1(PmsBaseCatalog1 object);

}