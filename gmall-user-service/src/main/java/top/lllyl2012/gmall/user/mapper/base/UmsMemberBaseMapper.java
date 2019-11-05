package top.lllyl2012.gmall.user.mapper.base;

import top.lllyl2012.gmall.bean.UmsMember;

import java.util.List;

/**
*  @author volume
*/
public interface UmsMemberBaseMapper {

    int insertUmsMember(UmsMember object);

    int updateUmsMember(UmsMember object);

    int update(UmsMember.UpdateBuilder object);

    List<UmsMember> queryUmsMember(UmsMember object);

    UmsMember queryUmsMemberLimit1(UmsMember object);

}