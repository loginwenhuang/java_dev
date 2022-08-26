package com.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 9:02
 */
@Controller
public class TestController {
    @RequestMapping("/qqq.do")
    public String test(Model model){
        System.out.println("=====");
        model.addAttribute("test",123);
        return "bbb";
    }
}
