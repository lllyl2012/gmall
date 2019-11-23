package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsSkuInfo;
/**
*  @author volume
*/
public interface PmsSkuInfoBaseMapper {

    int insertPmsSkuInfo(PmsSkuInfo object);

    int updatePmsSkuInfo(PmsSkuInfo object);

    int update(PmsSkuInfo.UpdateBuilder object);

    List<PmsSkuInfo> queryPmsSkuInfo(PmsSkuInfo object);

    PmsSkuInfo queryPmsSkuInfoLimit1(PmsSkuInfo object);

}