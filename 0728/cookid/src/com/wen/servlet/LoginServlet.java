package com.wen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/28 15:45
 */
@WebServlet(urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        if("admin".equals(userName)&&"123456".equals(password)){
            String check = req.getParameter("check");
            if("1".equals(check)){
                Cookie ck = new Cookie("userName",userName);
                ck.setMaxAge(60);
                resp.addCookie(ck);
            }
            req.setAttribute("userName",userName);
            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }else {
            req.setAttribute("error","账号或密码错误!");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }
}
