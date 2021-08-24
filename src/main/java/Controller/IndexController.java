package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    //跳转到登陆页面
    @GetMapping(value = {"/login"})
    public String loginPage(){
        return "Login page";
    }
}
