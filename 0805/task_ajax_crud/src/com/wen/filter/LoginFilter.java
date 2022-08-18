package com.wen.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 16:01
 */
@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {
    private String[] whiteNames = {"index.jsp","","login.jsp","LoginServlet"};
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp = (HttpServletResponse) servletResponse;

        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String requestURI = req.getRequestURI();
        String process = requestURI.substring(requestURI.lastIndexOf("/")+1);

        boolean isWhiteName = true;
        for (String s:whiteNames) {
            if(s.equals(process)){
                isWhiteName =true;
                break;
            }
        }
        if(isWhiteName){
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

    }
}
