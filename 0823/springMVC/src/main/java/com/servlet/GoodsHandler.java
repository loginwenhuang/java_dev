package com.servlet;

import com.service.IGoodsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 17:41
 */
@Controller
public class GoodsHandler {
    @Resource
    private HttpServletRequest request;
    @RequestMapping("/goods.wen")
    public String goodsList(Model model){
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        IGoodsService goodsService = webApplicationContext.getBean(IGoodsService.class);
        model.addAttribute("goodsList",goodsService.goodsList());
        return  "goods";
    }
}
