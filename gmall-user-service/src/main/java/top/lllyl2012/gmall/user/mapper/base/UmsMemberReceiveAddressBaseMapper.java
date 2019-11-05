package top.lllyl2012.gmall.user.mapper.base;

import top.lllyl2012.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

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