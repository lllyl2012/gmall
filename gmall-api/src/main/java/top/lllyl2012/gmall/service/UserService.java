package top.lllyl2012.gmall.service;

import top.lllyl2012.gmall.bean.UmsMember;
import top.lllyl2012.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface UserService {
    String index();

    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getAddressByUserId(UmsMemberReceiveAddress address);
}
