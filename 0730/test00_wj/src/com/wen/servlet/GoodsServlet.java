package com.wen.servlet;

import com.wen.service.IGoodsService;
import com.wen.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 17:01
 */
@WebServlet(urlPatterns = "/GoodsServlet")
public class GoodsServlet extends HttpServlet {
    IGoodsService goodsService = new GoodsServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("goodsList",goodsService.Goodses());
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
        //resp.setContentType("text/html;charset=UTF-8");
        //PrintWriter pw = resp.getWriter();
        //pw.println(goodsService.Goodses());
        //pw.flush();
        //pw.close();
    }
}
