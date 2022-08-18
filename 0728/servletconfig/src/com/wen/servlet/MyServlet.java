package com.wen.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/28 14:39
 */

public class MyServlet extends HttpServlet {
    private ServletConfig sc;

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        sc = this.getServletConfig();
        System.out.println(sc);
        String st1 = this.getInitParameter("aaa");
        String st2 = sc.getInitParameter("bbb");
        System.out.println(st1+"\n"+st2);
    }
}
