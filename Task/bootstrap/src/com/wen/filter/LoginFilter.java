package com.wen.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/4 9:48
 */
//@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {
    private String[] whiteNames;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String params = filterConfig.getInitParameter("whiteNames");
        whiteNames = params.split(",");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;
        String uri = req.getRequestURI();
        String operation = uri.substring(uri.lastIndexOf("/")+1);
        System.out.println("请求地址"+operation);
        boolean isWhiteName = false;
        for (String s:whiteNames) {
            System.out.println("白名单:"+s);
            if(operation.equals(s)){
                isWhiteName=true;
                break;
            }
        }
        if(isWhiteName){
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            if(req.getSession().getAttribute("userName")==null){
                req.getRequestDispatcher("/ToLoginServlet").forward(req,resp);
            }else {
                req.getRequestDispatcher("/ToMainServlet").forward(req,resp);
            }
        }
    }
}
