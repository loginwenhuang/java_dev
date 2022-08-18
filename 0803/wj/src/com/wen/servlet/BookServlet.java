package com.wen.servlet;

import com.mysql.cj.util.StringUtils;
import com.wen.service.IBookService;
import com.wen.service.impl.BookServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/3 9:18
 */
@WebServlet(urlPatterns = "/BookServlet/*")
public class BookServlet extends HttpServlet {
    IBookService bookService = new BookServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;character=UTF-8");

        String uri = req.getRequestURI();
        String operation = uri.substring(uri.lastIndexOf("/")+1);
        switch (operation){
            case "select":
                this.selectBook(req,resp);
                break;
            case "selectSome":
                this.selectSome(req,resp);
                break;
            default:
                break;
        }
    }

    private void selectSome(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String condition_name = req.getParameter("condition_name");
        String condition_author = req.getParameter("condition_author");
        req.setAttribute("condition_name",condition_name);
        req.setAttribute("condition_author",condition_author);
        if(StringUtils.isNullOrEmpty(condition_name)&&StringUtils.isNullOrEmpty(condition_author)){
            this.selectBook(req,resp);
        }
        if(!StringUtils.isNullOrEmpty(condition_name)&&!StringUtils.isNullOrEmpty(condition_author)){
            req.setAttribute("books",bookService.selectSomeBook(new String[]{condition_name,condition_author},3));
        }else {
            if(!StringUtils.isNullOrEmpty(condition_name)){
                req.setAttribute("books_name",bookService.selectSomeBook(new String[]{condition_name},1));
            }
            if(!StringUtils.isNullOrEmpty(condition_author)){
                req.setAttribute("books_author",bookService.selectSomeBook(new String[]{condition_author},2));
            }
        }
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }

    private void selectBook(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("books",bookService.selectAllBook());
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
