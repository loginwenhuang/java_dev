package com.wen.servlet;

import com.wen.entity.Book;
import com.wen.service.IBookService;
import com.wen.service.impl.IBookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 8:33
 */
public class ToMainService extends HttpServlet {
    IBookService bookService = new IBookServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = (String)req.getSession().getAttribute("userName");
        System.out.println(userName);
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
