package com.wen.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.View;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 14:21
 */
@Controller
public class ForwordController {
    @RequestMapping("/goodsPage")
    public String goodsPage(){
        return "goods";
    }

    @RequestMapping("/category")
    public String catePage(){
        return "category";
    }


}
