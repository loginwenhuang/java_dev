package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.mysql.cj.util.StringUtils;
import com.wen.entity.Student;
import com.wen.service.IClassService;
import com.wen.service.IStudentService;
import com.wen.service.impl.ClassServiceImpl;
import com.wen.service.impl.StudentService;

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
 * @date : 2022/8/5 16:57
 */
@WebServlet(urlPatterns = "/StudentServlet/*")
public class StudentServlet extends HttpServlet {
    IStudentService studentService = new StudentService();
    IClassService classService = new ClassServiceImpl();
    private Student student = new Student();
    private Integer pageNo = 1;
    private Integer pageSize = 3;
    private String search;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String URI = req.getRequestURI();
        String process = URI.substring(URI.lastIndexOf("/")+1);
        PrintWriter out = resp.getWriter();
        String date = "";
        System.out.println("StudentServlet:"+process);
        switch (process){
            case "allStu":
                date = this.allStu(req,resp);
                break;
            case "allClass":
                date = this.allClass(req,resp);
                break;
            case "delete":
                date = String.valueOf(this.delete(req,resp));
                break;
            case "addOrUpdate":
                this.addOrUpDate(req,resp);
                break;
            case "add":
                this.add(req,resp);
                break;
            case "update":
                this.update(req,resp);
                break;
            case "search":
                date = this.search(req,resp);
                break;
            case "page":
                date = this.queryByPage(req,resp);
                break;
            default:
                break;
        }
        out.print(date);
        out.flush();
        out.close();
    }

    private String queryByPage(HttpServletRequest req, HttpServletResponse resp) {
        String pn = req.getParameter("pageNo");
        String ps = req.getParameter("pageSize");

        pageNo = StringUtils.isNullOrEmpty(pn)?1:Integer.parseInt(pn);
        pageSize = StringUtils.isNullOrEmpty(ps)?3:Integer.parseInt(ps);
        return JSONObject.toJSONString(studentService.queryByPage(pageNo,pageSize));
    }

    private String search(HttpServletRequest req, HttpServletResponse resp) {
        search = "";
        return null;
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) {
        studentService.updateStu(student);
    }

    private void add(HttpServletRequest req, HttpServletResponse resp) {
        System.out.println("添加执行!");
        studentService.insertStu(student);
    }

    private void addOrUpDate(HttpServletRequest req, HttpServletResponse resp) {
        Integer studentId = null;
        try {
            studentId = Integer.valueOf(req.getParameter("studentId"));
        } catch (NumberFormatException e) {
            System.out.println("studentId为空");
        }
        student.setStudnetId(studentId);
        student.setName(req.getParameter("name"));
        student.setSex(req.getParameter("sex"));
        try {
            student.setBirthday(new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("birthday")));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        student.setProvince(req.getParameter("province"));
        try {
            student.setClassId(Integer.valueOf(req.getParameter("classId")));
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(student);
        if(studentId!=null){
            System.out.println("修改!");
            this.update(req,resp);
        }else{
            System.out.println("添加!");
            this.add(req,resp);
        }

    }

    private String allClass(HttpServletRequest req, HttpServletResponse resp) {
        String classList = JSONObject.toJSONString(classService.classList());
        System.out.println(classList);
        return classList;
    }

    private Integer delete(HttpServletRequest req, HttpServletResponse resp) {
        Integer stuId = Integer.valueOf(req.getParameter("studentId"));
        System.out.println(stuId);
        return studentService.deleteStu(stuId);

    }
    private String allStu(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String studentList = JSONObject.toJSONStringWithDateFormat(studentService.allStudent(),"yyyy-MM-dd");
        System.out.println(studentList);
        return studentList;
    }
}
