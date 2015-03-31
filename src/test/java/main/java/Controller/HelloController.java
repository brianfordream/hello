package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author brian.yang
 * @email brian.yang@qunar.com
 * @date 15-3-30
 */
@Controller
@RequestMapping("/robot")
public class HelloController {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "Hello";
    }
}
