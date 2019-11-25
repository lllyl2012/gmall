package top.lllyl2012.gmall.item.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ItemController {

    @RequestMapping("/test")
    public String test() {
        return "index";
    }
}
