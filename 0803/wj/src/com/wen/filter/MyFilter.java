package com.wen.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 16:25
 */
public class MyFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("MyFilter");
        servletRequest.setAttribute("n",123);
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
