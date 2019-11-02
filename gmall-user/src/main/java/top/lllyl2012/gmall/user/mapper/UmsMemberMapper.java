package top.lllyl2012.gmall.user.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.user.bean.UmsMember;
import top.lllyl2012.gmall.user.mapper.base.UmsMemberBaseMapper;
/**
*  @author volume
*/
public interface UmsMemberMapper extends UmsMemberBaseMapper{


    List<UmsMember> getAllUser();
}