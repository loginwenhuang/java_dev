package com.wen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 18:54
 */

/**
 * 接收 main.jsp 中修改用户信息的请求，转发至 userInformation.jsp(用户信息页)
 * @author wen
 */
@WebServlet(urlPatterns = "/ToModifyServlet")
public class ToModifyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/userInformation.jsp").forward(req,resp);
    }
}
