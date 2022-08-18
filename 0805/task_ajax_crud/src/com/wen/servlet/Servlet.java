package com.wen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 16:07
 */
@WebServlet(urlPatterns = "/LoginServlet")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");

        if("admin".equals(userName)&&"123456".equals(password)){
            req.getRequestDispatcher("/main.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
    }
}
