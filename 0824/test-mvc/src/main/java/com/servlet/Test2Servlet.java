package com.servlet;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 8:38
 */
public class Test2Servlet implements Controller {
    @Override
    public ModelAndView handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

        String contextConfigLocation = request.getServletContext().getInitParameter("contextConfigLocation");
        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(request.getServletContext());
        ModelAndView mv = new ModelAndView();
        mv.setViewName("test");
        mv.addObject("test",567);
        return mv;
    }
}
