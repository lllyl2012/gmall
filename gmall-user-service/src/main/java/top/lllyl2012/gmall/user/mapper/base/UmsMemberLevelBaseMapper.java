package top.lllyl2012.gmall.user.mapper.base;

import top.lllyl2012.gmall.bean.UmsMemberLevel;

import java.util.List;

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