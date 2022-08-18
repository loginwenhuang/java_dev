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
 * @date : 2022/7/28 15:16
 */
@WebServlet(urlPatterns = "/Test1Servlet")
public class Test1Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       Cookie[] cks = req.getCookies();
       boolean flag = false;
       String username = null;
       if(cks!=null){
           for(Cookie ck : cks){
               if(ck.getName().equals("userName")){
                   username = ck.getValue();
                   flag = true;
                   break;
               }
           }
       }
       if(flag){
           req.setAttribute("userName",username);
           req.getRequestDispatcher("/success.jsp").forward(req,resp);
       }else {
           req.getRequestDispatcher("/login.jsp").forward(req,resp);
       }
    }
}
