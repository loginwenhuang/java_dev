package com.wen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 11:20
 */
@WebServlet("/SignOutServlet")
public class SignOutServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getSession().getAttribute("userName");
        HttpSession session = req.getSession();
        //销毁session
        session.invalidate();
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }
}
