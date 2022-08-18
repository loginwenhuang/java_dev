package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.util.StringUtils;
import com.wen.entity.CommonResult;
import com.wen.service.IGoodsService;
import com.wen.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 17:50
 */
@WebServlet(urlPatterns = "/GoodsServlet/*")
public class GoodsServlet extends HttpServlet {
    private IGoodsService goodsService = new GoodsServiceImpl();
    private CommonResult commonResult = null;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String uri =req.getRequestURI();
        String process = uri.substring(uri.lastIndexOf("/")+1);
        System.out.println(process);
        CommonResult res = null;
        System.out.println(req.getParameter("page"));
        System.out.println(req.getParameter("limit"));
        switch (process){
            case "allGoods":
                res = this.allGoods(req,resp);
                break;
            default:
                break;
        }
        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(res,"yyyy-MM-dd"));
        out.flush();
        out.close();
    }

    private CommonResult allGoods(HttpServletRequest req, HttpServletResponse resp) {
        List<Map<String,Object>> goodsList = goodsService.goodsList();
        if(goodsList!=null){
           return CommonResult.success(goodsList.size(),goodsList);
        }
        return CommonResult.fail();
    }
}
