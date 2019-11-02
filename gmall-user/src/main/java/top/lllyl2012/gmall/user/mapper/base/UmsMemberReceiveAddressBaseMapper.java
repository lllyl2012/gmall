package top.lllyl2012.gmall.user.mapper.base;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.lllyl2012.gmall.user.bean.UmsMemberReceiveAddress;
/**
*  @author volume
*/
public interface UmsMemberReceiveAddressBaseMapper {

    int insertUmsMemberReceiveAddress(UmsMemberReceiveAddress object);

    int updateUmsMemberReceiveAddress(UmsMemberReceiveAddress object);

    int update(UmsMemberReceiveAddress.UpdateBuilder object);

    List<UmsMemberReceiveAddress> queryUmsMemberReceiveAddress(UmsMemberReceiveAddress object);

    UmsMemberReceiveAddress queryUmsMemberReceiveAddressLimit1(UmsMemberReceiveAddress object);

}