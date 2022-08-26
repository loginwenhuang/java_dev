package com.wen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 15:37
 */
@Controller
@RequestMapping("/page")
public class ForwardController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/page1")
    public String page1(){
        return "page1";
    }

    @RequestMapping("/page2")
    public String page2(){
        return "page2";
    }

    @RequestMapping("/page3")
    public String page3(){
        return "page3";
    }

    @RequestMapping("/page4")
    public String page4(){
        return "page4";
    }

    @RequestMapping("/page5")
    public String page5(){
        return "page5";
    }
}
