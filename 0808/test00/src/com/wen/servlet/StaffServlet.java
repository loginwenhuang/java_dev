package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wen.entity.Staff;
import com.wen.service.IDepartmentService;
import com.wen.service.IStaffInfoService;
import com.wen.service.impl.DepartmentServiceImpl;
import com.wen.service.impl.StaffInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.PrivateKey;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 15:21
 */
@WebServlet(urlPatterns = "/StaffServlet/*")
public class StaffServlet extends HttpServlet {
    private IStaffInfoService staffInfoService = new StaffInfoServiceImpl();
    private IDepartmentService departmentService = new DepartmentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String uri = req.getRequestURI();
        String process = uri.substring(uri.lastIndexOf("/")+1);
        Object data = "";
        switch (process){
            case "select":
                data = this.select(req,resp);
                break;
            case "add":
                try {
                    data = this.add(req,resp);
                } catch (ParseException e) {
                    e.printStackTrace();
                }
                break;
            case "selectD":
                data = this.selectD(req,resp);
                break;
            default:
                break;
        }
        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(data,"yyyy-MM-dd"));
        out.flush();
        out.close();
    }

    private Object selectD(HttpServletRequest req, HttpServletResponse resp) {
        return departmentService.AllDepartment();
    }

    private Object add(HttpServletRequest req, HttpServletResponse resp) throws ParseException {
        String name = req.getParameter("s_name");
        String sex =req.getParameter("sex");
        System.out.println(req.getParameter("birthday"));
        Date date = null;
        try {
            date = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        String phone = req.getParameter("phone");
        Integer d_id = Integer.parseInt(req.getParameter("d_id"));
        return staffInfoService.addStaff(new Staff(
                name,
                sex,
                date,
                phone,
                d_id
        ));
    }

    private Object select(HttpServletRequest req, HttpServletResponse resp) {
        return staffInfoService.AllStaffInfo();
    }
}
