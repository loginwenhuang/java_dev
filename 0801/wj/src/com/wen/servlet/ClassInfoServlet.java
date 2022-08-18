package com.wen.servlet;

import com.wen.entity.ClassInfo;
import com.wen.service.IClassInfoService;
import com.wen.service.impl.ClassInfoServiceImpl;
import com.wen.util.PackageClassInfoDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 16:58
 */
@WebServlet(urlPatterns = "/ClassInfoServlet/*")
public class ClassInfoServlet extends HttpServlet {
    IClassInfoService classInfoService = new ClassInfoServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;character=UTF-8");

        String URI = req.getRequestURI();
        String OPERATION = URI.substring(URI.lastIndexOf("/")+1);
        switch (OPERATION){
            case "":
            case "select":
                this.selectAllClass(req,resp);
                break;
            case "update":
                this.updateClass(req,resp);
                break;
            case "insert":
                this.insertClass(req,resp);
                break;
            case "delete":
                this.deleteClass(req,resp);
                break;
            case "clean":
                this.cleanClass(req,resp);
                break;
            default:
                break;
        }
    }

    private void cleanClass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        classInfoService.cleanClass();
        this.selectAllClass(req,resp);
    }

    private void deleteClass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(classInfoService.deleteClass(Integer.valueOf(req.getParameter("classId")))){
            this.selectAllClass(req,resp);
        }else {
            System.out.println("删除失败!");
        }
    }

    private void insertClass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassInfo classInfo = PackageClassInfoDao.packageClassInfo(req);
        if(classInfoService.insertClass(classInfo)){
            this.selectAllClass(req,resp);
        }else {
            System.out.println("添加失败!");
        }
    }

    private void updateClass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ClassInfo classInfo = PackageClassInfoDao.packageClassInfo(req);
        if(classInfoService.modifyClass(classInfo)){

        }else {
            System.out.println("修改失败!");
        }
        this.selectAllClass(req,resp);
    }

    private void selectAllClass(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("classInfoList",classInfoService.allClass());
        System.out.println(classInfoService.allClass());
        req.getRequestDispatcher("/classInfo.jsp").forward(req,resp);
    }
}
