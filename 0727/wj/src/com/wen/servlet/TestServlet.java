package com.wen.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 14:51
 *
 */
@WebServlet(urlPatterns = "/TestServlet")
public class TestServlet extends HttpServlet {
    private static final transient String GET = "GET";
    public TestServlet() {
        System.out.println("TestServlet 被创建了!");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("TestServlet 被调用-初始化");
        System.out.println("TestServlet:"+this.getServletName());
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(GET.equals(req.getMethod())){
            this.doGet(req,resp);
        }else {
            this.doPost(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理get请求");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("处理post请求");
    }

    @Override
    public void destroy() {
        System.out.println("TestServlet 被销毁");
    }
}
