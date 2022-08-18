package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wen.service.IStaffService;
import com.wen.service.impl.StaffServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author :muxiaowen
 * @date : 2022/8/7 14:54
 */
@WebServlet(urlPatterns = "/StaffServlet")
public class StaffServlet extends HttpServlet {
    private IStaffService staffService = new StaffServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String URI = req.getRequestURI();
        String process = URI.substring(URI.lastIndexOf("/")+1);

        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(staffService.queryAllStaff(),"yyyy-MM-dd"));
        out.flush();
        out.close();
    }
}
