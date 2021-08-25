package MyApp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class IndexController {
    /**
     * 跳转到登陆页面
     *
     * @return
     */
    @GetMapping(value = {"/login"})
    public String loginPage() {
        //跳转到登录页 login.html
        return "login";
    }
}