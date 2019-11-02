package top.lllyl2012.gmall.user.service;

import top.lllyl2012.gmall.user.bean.UmsMember;
import top.lllyl2012.gmall.user.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    String index();

    List<UmsMember> getAllUser();

    UmsMemberReceiveAddress getAddressByUserId(UmsMemberReceiveAddress address);
}
