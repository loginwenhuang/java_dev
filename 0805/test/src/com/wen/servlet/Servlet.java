package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.xdevapi.JsonArray;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 8:50
 */
@WebServlet(urlPatterns = "/AjaxServlet")
public class Servlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("请求到达!");
        String time = LocalDateTime.now().toString();
        resp.setContentType("text/html;charset=utf-8");
        Map map = new HashMap();
        map.put("id",1000);
        map.put("name","张三");
        map.put("sex","男");

        System.out.println(map);
        System.out.println(JSONObject.toJSONString(map));
        JSONObject jsonArray = new JSONObject(map);
        System.out.println(jsonArray);

        PrintWriter out = resp.getWriter();
        out.println(jsonArray);
        out.flush();
        out.close();
    }
}
