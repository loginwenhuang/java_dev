package com.wen.servlet;

import com.wen.entity.Goods;
import com.wen.service.IGoodsService;
import com.wen.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 9:13
 */
@WebServlet(urlPatterns = "/GoodsServlet")
public class GoodsServlet extends HttpServlet {
    IGoodsService goodsService = new GoodsServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Goods> goodsList = goodsService.goodsList();
        req.setAttribute("goodsList",goodsList);
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
