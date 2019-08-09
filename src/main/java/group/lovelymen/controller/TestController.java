package group.lovelymen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author 阿丁猴
 */
@RestController
public class TestController {
    String testString = "controller传来的测试文段";

    @RequestMapping("")
    public String showIndex(){
        return testString;
    }

    @RequestMapping("index.do")
    public ModelAndView index(){
        return new ModelAndView("test");
    }
}
