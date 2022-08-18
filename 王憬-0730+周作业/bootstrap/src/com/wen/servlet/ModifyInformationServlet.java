package com.wen.servlet;

import com.wen.entity.Student;
import com.wen.service.IStudentService;
import com.wen.service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/29 16:16
 */

/**
 * 接收来自 userInformation.jsp 的数据(form)
 * 对用户信息进行修改(数据库)
 */
@WebServlet(urlPatterns = "/ModifyInformationServlet")
public class ModifyInformationServlet extends HttpServlet {
    Student student = null;
    private String USERID = "userId";
    IStudentService studentService = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stuName = req.getParameter("stuName");
        String sex = req.getParameter("sex");
        String birthday = req.getParameter("birthday");
        Integer userId = (Integer) req.getSession().getAttribute("userId");
        System.out.println(userId);
        try {
            student = new Student(stuName,sex,
                    new SimpleDateFormat("yyyy-MM-dd").parse( birthday),
                    userId
            );
            if(studentService.updateStu(student)){
                req.setAttribute("Tips","提交成功!");
            }else {
                req.setAttribute("Tips","提交失败!");
                System.out.println("失败!");
            }
            req.getRequestDispatcher("/userInformation.jsp").forward(req,resp);
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
