package com.wen.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 9:04
 */
@WebFilter(urlPatterns = "/*")
public class LoginFilter implements Filter {
    private String[] params = new String[]{"index.jsp","","login.jsp","LoginServlet"};
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("登录过滤");
        HttpServletRequest req = (HttpServletRequest) servletRequest;
        HttpServletResponse resp =(HttpServletResponse) servletResponse;

        String uri = req.getRequestURI();
        String process = uri.substring(uri.lastIndexOf("/")+1);
        System.out.println("地址:"+process);
        boolean flag = false;
        for (String s:params) {
            System.out.println("遍历:"+s);
            if(s.equals(process)){
                System.out.println("放行!");
                flag = true;
            }
        }
        if(flag){
            filterChain.doFilter(servletRequest, servletResponse);
        }else {
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
