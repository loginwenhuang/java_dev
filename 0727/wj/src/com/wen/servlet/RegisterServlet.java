package com.wen.servlet;

import com.wen.service.ILoginAndRegisterService;
import com.wen.service.impl.LoginAndRegisterService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 17:49
 */
@WebServlet(urlPatterns = "/registerServlet")
public class RegisterServlet extends HttpServlet {
    ILoginAndRegisterService loginAndRegisterService = new LoginAndRegisterService();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        if(loginAndRegisterService.userRegister(userName,password)){
            RequestDispatcher rd = req.getRequestDispatcher("/login.jsp");
            rd.forward(req,resp);
        }else {
            System.out.println("注册失败!");
        }
    }
}
