package top.lllyl2012.gmall.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lllyl2012.gmall.user.bean.UmsMember;
import top.lllyl2012.gmall.user.bean.UmsMemberReceiveAddress;
import top.lllyl2012.gmall.user.mapper.UmsMemberMapper;
import top.lllyl2012.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import top.lllyl2012.gmall.user.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UmsMemberMapper umsMemberMapper;

    @Autowired
    private UmsMemberReceiveAddressMapper addressMapper;

    @Override
    public String index() {
        return "ok";
    }

    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.queryUmsMember(new UmsMember());
    }

    @Override
    public UmsMemberReceiveAddress getAddressByUserId(UmsMemberReceiveAddress address) {
        return addressMapper.queryUmsMemberReceiveAddressLimit1(address);
    }
}
