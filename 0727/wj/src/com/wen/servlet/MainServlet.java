package com.wen.servlet;

import com.wen.dao.IStudentDao;
import com.wen.dao.impl.StudentDaoImpl;
import com.wen.entity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 19:14
 */
@WebServlet(urlPatterns = "/mainServlet")
public class MainServlet extends HttpServlet {
    IStudentDao studentDao = new StudentDaoImpl();
    Student student = null;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer stuId =Integer.valueOf(req.getParameter("stuId"));
        String stuName = req.getParameter("stuName");
        String sex = req.getParameter("sex");
        Date birthday = null;
        try {
            birthday = new SimpleDateFormat("yyyy-MM-dd").parse(req.getParameter("birthday"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        student = new Student(stuId,stuName,sex,birthday);
        if(studentDao.updateStu(student)>0){
            resp.sendRedirect("login.jsp");
        }else {
            System.out.println("修改失败!");
        }
    }
}
