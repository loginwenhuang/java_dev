package com.servlet;

import com.alibaba.fastjson.JSONObject;
import com.entity.CommonResult;
import com.entity.Goods;
import com.service.IGoodsService;
import com.service.impl.GoodsServiceImpl;
import lombok.SneakyThrows;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.beans.SimpleBeanInfo;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 11:06
 */
@WebServlet(urlPatterns = "/GoodsServlet/*")
public class GoodsServlet extends HttpServlet {
    private IGoodsService goodsService = new GoodsServiceImpl();
    @SneakyThrows
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String uri = req.getRequestURI();
        String process = uri.substring(uri.lastIndexOf("/")+1);
        System.out.println(process);
        Object data = null;
        switch (process){
            case "selectByPage":
                data = this.goodsListByPage(req,resp);
                break;
            case "insert":
                data = this.insert(req,resp);
                break;
            case "delete":
                data = this.delete(req,resp);
                break;
            case "update":
                data = this.update(req,resp);
                break;
            default:
                break;
        }
        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(data,"yyyy-MM-dd"));
        out.close();
    }

    private Object update(HttpServletRequest req, HttpServletResponse resp) throws ParseException {
        Integer goodsId = Integer.valueOf(req.getParameter("goodsId"));
        String goodsName = req.getParameter("goodsName");
        Double price = Double.valueOf(req.getParameter("price"));
        Date produceDate = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("produceDate"));
        String address = req.getParameter("address");
        Integer categoryId = Integer.valueOf(req.getParameter("categoryId"));

        Goods goods = new Goods();
        goods.setGoodsId(goodsId);
        goods.setGoodsName(goodsName);
        goods.setPrice(price);
        goods.setProduceDate(produceDate);
        goods.setAddress(address);
        goods.setCategoryId(categoryId);

        System.out.println(goods);
        int count = goodsService.updateGoods(goods);
        if(count==1){
            return CommonResult.success();
        }
        return CommonResult.fail();
    }

    private Object delete(HttpServletRequest req, HttpServletResponse resp) {
        Integer goodsId = Integer.valueOf(req.getParameter("ids"));
        int count = goodsService.deleteGoods(goodsId);
        if(count==1){
            return CommonResult.success();
        }
        return CommonResult.fail();
    }

    private Object insert(HttpServletRequest req, HttpServletResponse resp) throws ParseException {
        String goodsName = req.getParameter("goodsName");
        Double price = Double.valueOf(req.getParameter("price"));
        Date produceDate = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("produceDate"));
        String address = req.getParameter("address");
        Integer categoryId = Integer.valueOf(req.getParameter("categoryId"));

        Goods goods = new Goods();
        goods.setGoodsName(goodsName);
        goods.setPrice(price);
        goods.setProduceDate(produceDate);
        goods.setAddress(address);
        goods.setCategoryId(categoryId);
        ArrayList arrayList = new ArrayList();
        arrayList.add(goods);
        int count = goodsService.insertGoodsList(arrayList);
        if(count==1){
            return CommonResult.success();
        }
        return CommonResult.fail();
    }

    private Object goodsListByPage(HttpServletRequest req, HttpServletResponse resp) {
        Integer page = Integer.valueOf(req.getParameter("page"));
        Integer limit = Integer.valueOf(req.getParameter("limit"));

        return CommonResult.success(goodsService.goodsListByPage(page,limit));
    }
}
