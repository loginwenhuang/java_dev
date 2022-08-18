package com.wen.servlet;

import com.wen.dao.impl.StudentDaoImpl;
import com.wen.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 8:28
 */

/**
 *`处理来自 首页(index.jsp)的请求
 * 可以通过cookie来判断是否有免登录
 * 有免登录则转发到 /ToMainServlet
 * 没有免登录则转发到 /login.jsp (登录页面)
 * @author wen
 */
@WebServlet(urlPatterns = "/ToLoginServlet")
public class ToLoginServlet extends HttpServlet {
    StudentDaoImpl studentDao = new StudentDaoImpl();
    private String COOKIE_NAME = "userId";
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie[] cks = req.getCookies();
        if(cks!=null){
            for (Cookie ck:cks) {
                    if (COOKIE_NAME.equals(ck.getName())){
                        req.getRequestDispatcher("/ToMainServlet").forward(req,resp);
                        return;
                    }
            }
        }
        req.getRequestDispatcher("/login.jsp").forward(req,resp);
    }
}
