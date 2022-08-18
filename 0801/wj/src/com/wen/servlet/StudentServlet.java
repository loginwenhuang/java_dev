package com.wen.servlet;

import com.wen.entity.Student;
import com.wen.service.IClassInfoService;
import com.wen.service.IStudentService;
import com.wen.service.impl.ClassInfoServiceImpl;
import com.wen.service.impl.StudentServiceImpl;
import com.wen.util.PackageStudentDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 9:13
 */
@WebServlet(urlPatterns = "/StudentServlet/*")
public class StudentServlet extends HttpServlet {
    IStudentService studentService = new StudentServiceImpl();
    IClassInfoService classInfoService = new ClassInfoServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;character=UTF-8");

        String URI = req.getRequestURI();
        System.out.println(URI);
        String operation = URI.substring(URI.lastIndexOf("/")+1);
        System.out.println(operation);
        switch (operation){
            case "":
            case "select":
                System.out.println(operation);
                this.selectStudent(req,resp);
                break;
            case "insert":
                this.insertStudent(req,resp);
                break;
            case "update":
                this.updateStudent(req,resp);
                break;
            case "delete":
                this.deleteStudent(req,resp);
                break;
            case "clean":
                this.cleanStudent(req,resp);
                break;
            default:
                break;
        }

    }
    private void deleteStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer stuId = Integer.valueOf(req.getParameter("stuId"));
        if(studentService.removeStudent(stuId)){
            this.selectStudent(req, resp);
        }else {
            System.out.println("删除失败");
        }

    }

    private void cleanStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(studentService.clearStudent());
        this.selectStudent(req,resp);
    }

    private void updateStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = PackageStudentDao.packageStudent(req);
        System.out.println(student);
        if(studentService.modifyStudent(student)){
            this.selectStudent(req,resp);
        }else {
            System.out.println("修改失败!");
        }
    }

    private void insertStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Student student = PackageStudentDao.packageStudent(req);
        if(studentService.addStudent(student)){
            this.selectStudent(req,resp);
        }else {
            System.out.println("添加失败");
        }
    }

    private void selectStudent(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("studentList",studentService.allStudents());
        req.setAttribute("classList",classInfoService.allClass());
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
