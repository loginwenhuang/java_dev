package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.util.StringUtils;
import com.wen.entity.CommonResult;
import com.wen.entity.Goods;
import com.wen.service.IGoodsService;
import com.wen.service.impl.GoodsServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
            case "addressList":
                res = this.addressList(req,resp);
                break;
            case "add":
                try {
                    res = this.addGoods(req,resp);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "update":
                try {
                    res = this.updateGoods(req,resp);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "delete":
                res = this.deleteGoods(req,resp);
                break;
            default:
                break;
        }
        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(res,"yyyy-MM-dd"));
        out.flush();
        out.close();
    }

    private CommonResult deleteGoods(HttpServletRequest req, HttpServletResponse resp) {
        String ids = req.getParameter("ids");
        if(goodsService.deleteGoods(ids)>0){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    private CommonResult updateGoods(HttpServletRequest req, HttpServletResponse resp) throws ParseException {
        Integer goodsId = Integer.valueOf(req.getParameter("goodsId"));
        String goodsName = req.getParameter("goodsName");
        Double price = Double.valueOf(req.getParameter("price"));
        Date produceDate = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("produceDate"));
        String address = req.getParameter("address");
        Integer categoryId= Integer.valueOf(req.getParameter("categoryId"));
        int count  = goodsService.updateGoods(new Goods(goodsId,goodsName,price,produceDate,address,categoryId));
        if(count==1){
            return CommonResult.success();
        }else {
            return CommonResult.fail();
        }
    }

    private CommonResult addGoods(HttpServletRequest req, HttpServletResponse resp) throws ParseException {
        String goodsName = req.getParameter("goodsName");
        Double price = Double.valueOf(req.getParameter("price"));
        Date produceDate = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("produceDate"));
        String address = req.getParameter("address");
        Integer categoryId= Integer.valueOf(req.getParameter("categoryId"));
        if(goodsService.addGoods(new Goods(goodsName,price,produceDate,address,categoryId))==1){
           return CommonResult.success();
        }else {
            return CommonResult.fail();
        }

    }

    private CommonResult addressList(HttpServletRequest req, HttpServletResponse resp) {
        List<Map<String,Object>> addressList = goodsService.addressList();
        if(addressList.size()>0){
            return CommonResult.success(addressList.size(),addressList);
        }else {
            return CommonResult.fail();
        }
    }

    private CommonResult allGoods(HttpServletRequest req, HttpServletResponse resp) {
        Integer page = Integer.valueOf(req.getParameter("page"));
        Integer limit = Integer.valueOf(req.getParameter("limit"));
        Integer totalCount = goodsService.goodsList().size();
        List<Map<String,Object>> goodsList = goodsService.goodsByPage(page,limit);
        if(goodsList!=null){
           return CommonResult.success(totalCount,goodsList);
        }
        return CommonResult.fail();
    }
}
