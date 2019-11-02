package top.lllyl2012.gmall.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lllyl2012.gmall.user.bean.UmsMember;
import top.lllyl2012.gmall.user.bean.UmsMemberReceiveAddress;
import top.lllyl2012.gmall.user.service.UserService;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return userService.index();
    }

    @RequestMapping("/getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser() {
        return userService.getAllUser();
    }

    @RequestMapping("/getAddressByUserId")
    @ResponseBody
    public UmsMemberReceiveAddress getAddressByUserId(UmsMemberReceiveAddress address) {
        return userService.getAddressByUserId(address);
    }
}
