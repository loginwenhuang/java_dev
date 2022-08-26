package com.servlet;

import com.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 20:20
 */
@Controller
public class GoodsController {
    @Resource
    private HttpServletRequest request;

    @Resource
    private IGoodsService goodsService;

    @RequestMapping("/goods.wen")
    public String goodsList(Model model){
        model.addAttribute("goodsList",goodsService.goodsList());
        return "goods";
    }
}
