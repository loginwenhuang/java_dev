package com.wen.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 16:20
 */
@WebFilter(urlPatterns = "/*")
public class CharacterEncodingFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("设置编码的");
        //设置编码
        servletRequest.setCharacterEncoding("utf-8");
        servletResponse.setContentType("text/html;character=utf-8");
        //请求放行
        filterChain.doFilter(servletRequest,servletResponse);
    }
}
