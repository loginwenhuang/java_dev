package com.wen.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/4 8:24
 */
@WebFilter(urlPatterns = "/*")
public class TestFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;utf-8");

        servletRequest.setAttribute("num","123");
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
