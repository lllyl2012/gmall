package top.lllyl2012.gmall.user.mapper;

import top.lllyl2012.gmall.bean.UmsMember;
import top.lllyl2012.gmall.user.mapper.base.UmsMemberBaseMapper;

import java.util.List;

/**
*  @author volume
*/
public interface UmsMemberMapper extends UmsMemberBaseMapper{


    List<UmsMember> getAllUser();
}