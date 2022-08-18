package com.wen.servlet;

import com.wen.dao.ILoginAndRegisterDao;
import com.wen.dao.IStudentDao;
import com.wen.dao.impl.StudentDaoImpl;
import com.wen.entity.Student;
import com.wen.service.ILoginAndRegisterService;
import com.wen.service.impl.LoginAndRegisterService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 11:59
 */
@WebServlet(urlPatterns = "/loginServlet")
public class LoginServlet extends HttpServlet {
    ILoginAndRegisterService loginAndRegisterService = new LoginAndRegisterService();
    IStudentDao studentDao = new StudentDaoImpl();
    Student student = null;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        System.out.println(userName);
        System.out.println(password);
        int userId = loginAndRegisterService.userLogin(userName,password);
        if(userId>0){
            System.out.println("登录成功!");
            student = studentDao.selectStu(userId);
            req.setAttribute("userName",userName);
            req.setAttribute("stuId",student.getStuId());
            req.setAttribute("stuName",student.getStuName());
            req.setAttribute("sex",student.getSex());
            req.setAttribute("birthday",student.getBirthday());
            RequestDispatcher rd = req.getRequestDispatcher("/main.jsp");
            rd.forward(req,resp);
        }else {
            System.out.println("登录失败!");
            req.setAttribute("message","登录失败!");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }

    }
}
