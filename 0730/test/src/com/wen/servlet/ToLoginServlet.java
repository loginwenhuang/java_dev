package com.wen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 8:52
 */
@WebServlet(urlPatterns = "ToLoginServlet")
public class ToLoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = (String) req.getSession().getAttribute("useName");
        if(userName.length()>0){
            req.getRequestDispatcher("/main.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

    }
}
