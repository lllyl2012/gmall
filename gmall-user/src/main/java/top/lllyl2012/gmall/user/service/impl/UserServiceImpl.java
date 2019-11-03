package top.lllyl2012.gmall.user.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import top.lllyl2012.gmall.bean.UmsMember;
import top.lllyl2012.gmall.bean.UmsMemberReceiveAddress;
import top.lllyl2012.gmall.user.mapper.UmsMemberMapper;
import top.lllyl2012.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import top.lllyl2012.gmall.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UmsMemberMapper umsMemberMapper;

    private final UmsMemberReceiveAddressMapper addressMapper;

    @Autowired
    public UserServiceImpl(UmsMemberMapper umsMemberMapper, UmsMemberReceiveAddressMapper addressMapper) {
        this.umsMemberMapper = umsMemberMapper;
        this.addressMapper = addressMapper;
    }

    @Override
    public String index() {
        return "ok";
    }

    @Override
    public List<UmsMember> getAllUser() {
        return umsMemberMapper.queryUmsMember(new UmsMember());
    }

    @Override
    public List<UmsMemberReceiveAddress> getAddressByUserId(UmsMemberReceiveAddress address) {
        return addressMapper.queryUmsMemberReceiveAddress(address);
    }
}
