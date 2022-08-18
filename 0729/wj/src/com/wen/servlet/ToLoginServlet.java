package com.wen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 10:52
 */
@WebServlet("/ToLoginServlet")
public class ToLoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //根据session的name获取session的值
        String userName = (String)req.getSession().getAttribute("userName");
        String password = (String)req.getSession().getAttribute("password");
        System.out.println(userName);
        System.out.println(password);

        System.out.println(req.getSession().getId());
        if(userName!=null&&password!=null){
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
