package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wen.entity.ComResult;
import com.wen.service.IBookService;
import com.wen.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 9:19
 */
@WebServlet(urlPatterns = "/BookServlet")
public class BookServlet extends HttpServlet {
    private IBookService bookService = new BookServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        Integer page = Integer.valueOf(req.getParameter("page"));
        Integer limit = Integer.valueOf(req.getParameter("limit"));

        Object data = ComResult.success(bookService.countBooks(),bookService.allBooks(page,limit));
        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(data,"yyyy-MM-dd"));
        out.flush();
        out.close();
    }
}
