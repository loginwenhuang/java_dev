package com.servlet;

import com.mapper.GoodsMapper;
import com.service.IGoodsService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 19:57
 */

public class GoodsServlet implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        IGoodsService goodsService = webApplicationContext.getBean(IGoodsService.class);
        ModelAndView mv = new ModelAndView();
        mv.setViewName("goods");
        mv.addObject("goodsList",goodsService.goodsList());
        return mv;
    }
}
