package com.wen.controller;

import com.wen.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 8:51
 */

@Controller
public class GoodsController {
    @Resource
    private IGoodsService goodsService;

    @RequestMapping("/list")
    @ResponseBody
    public String goodsList(){
        return goodsService.goodsList().toString();
    }
}
