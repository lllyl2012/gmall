package top.lllyl2012.gmall.user.mapper;

import java.util.List;

import top.lllyl2012.gmall.bean.UmsMember;
import top.lllyl2012.gmall.user.mapper.base.UmsMemberBaseMapper;
/**
*  @author volume
*/
public interface UmsMemberMapper extends UmsMemberBaseMapper{


    List<UmsMember> getAllUser();
}