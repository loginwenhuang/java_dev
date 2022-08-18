package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wen.entity.Staff;
import com.wen.service.IStaffService;
import com.wen.service.impl.StaffServiceImpl;

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

/**
 * @author :muxiaowen
 * @date : 2022/8/8 9:17
 */
@WebServlet(urlPatterns = "/StaffServlet/*")
public class StaffServlet extends HttpServlet {
    private IStaffService staffService = new StaffServiceImpl();
    private String search;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String uri =req.getRequestURI();
        String process = uri.substring(uri.lastIndexOf("/")+1);
        System.out.println(process);
        Object data = "";
        switch (process){
            case "select":
                data = this.selectAll(req,resp);
                break;
            case "add":
                try {
                    data = this.add(req,resp);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "search":
                data = this.search(req,resp);
                break;
            default:
                break;
        }
        System.out.println(data);
        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(data,"yyyy-MM-dd"));
        out.flush();
        out.close();
    }

    private Object search(HttpServletRequest req, HttpServletResponse resp) {
        search = req.getParameter("search");
        return staffService.querySomeStaff(search);
    }

    private Object add(HttpServletRequest req, HttpServletResponse resp) throws ParseException {
        String name = req.getParameter("name");
        String sex = req.getParameter("sex");
        String birthday = req.getParameter("birthday");
        String phone = req.getParameter("phone");
        Integer d_id = Integer.valueOf(req.getParameter("d_id"));
        return staffService.insertStaff(new Staff(
                name,
                sex,
                new SimpleDateFormat("yyyy-MM-dd").parse(birthday),
                phone,
                d_id
        ));
    }

    private Object selectAll(HttpServletRequest req, HttpServletResponse resp) {
        return staffService.queryAllStaff();
    }
}
