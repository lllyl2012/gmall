package top.lllyl2012.gmall.manage.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.bean.PmsProductVertifyRecord;
/**
*  @author volume
*/
public interface PmsProductVertifyRecordBaseMapper {

    int insertPmsProductVertifyRecord(PmsProductVertifyRecord object);

    int updatePmsProductVertifyRecord(PmsProductVertifyRecord object);

    int update(PmsProductVertifyRecord.UpdateBuilder object);

    List<PmsProductVertifyRecord> queryPmsProductVertifyRecord(PmsProductVertifyRecord object);

    PmsProductVertifyRecord queryPmsProductVertifyRecordLimit1(PmsProductVertifyRecord object);

}