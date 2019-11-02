package top.lllyl2012.gmall.user.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.user.bean.UmsMemberLevel;
/**
*  @author volume
*/
public interface UmsMemberLevelBaseMapper {

    int insertUmsMemberLevel(UmsMemberLevel object);

    int updateUmsMemberLevel(UmsMemberLevel object);

    int update(UmsMemberLevel.UpdateBuilder object);

    List<UmsMemberLevel> queryUmsMemberLevel(UmsMemberLevel object);

    UmsMemberLevel queryUmsMemberLevelLimit1(UmsMemberLevel object);

}