package com.servlet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 8:33
 */
@Controller
public class TestController {
    @RequestMapping("/test.wen")
    public String test(Model model){
        model.addAttribute("test",1000);
        return "test";
    }
}
