package com.wen.servlet;

import com.wen.service.IUserService;
import com.wen.service.impl.IUserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 9:09
 */
@WebServlet(urlPatterns = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    IUserService userService = new IUserServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        if(userService.login(userName,password)){
            System.out.println("登录成功");
            //直接获取session,不存在就创建一个
            HttpSession session =req.getSession();
            //设置session的值
            session.setAttribute("userName",userName);
            session.setAttribute("password",password);
            //获取session ID
            System.out.println(session.getId());

            req.getRequestDispatcher("/success.jsp").forward(req,resp);
        }else {
            System.out.println("登录失败");
            req.getRequestDispatcher("/fail.jsp").forward(req,resp);
        }
    }
}
