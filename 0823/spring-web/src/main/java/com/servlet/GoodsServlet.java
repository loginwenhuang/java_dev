package com.servlet;

import com.service.IGoodsService;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 15:36
 */
@WebServlet(urlPatterns = "/GoodsServlet")
public class GoodsServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String contextConfigLocation = this.getServletContext().getInitParameter("contextConfigLocation");
        System.out.println("配置文件的位置:"+contextConfigLocation);

        WebApplicationContext webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(this.getServletContext());
        IGoodsService goodsService = webApplicationContext.getBean(IGoodsService.class);

        req.setAttribute("goods",goodsService.goodsList());
        req.getRequestDispatcher("/goods.jsp").forward(req,resp);
    }
}
