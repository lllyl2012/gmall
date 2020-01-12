package top.lllyl2012.gmall.order;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import top.lllyl2012.gmall.annotations.LoginRequired;

@Controller
@RequestMapping("/order")
public class OrderController {

    @RequestMapping("/test")
    @ResponseBody
    @LoginRequired(loginSuccess = true)
    public String orderTest() {
        return "ok";
    }

    @RequestMapping("/test1")
    @ResponseBody
    @LoginRequired(loginSuccess = false)
    public String test() {
        return "ok2";
    }
}
