package com.wen.servlet;

import com.wen.service.IClassInfoService;
import com.wen.service.impl.ClassInfoServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 8:39
 */
@WebServlet(urlPatterns = "/ClassInfoServlet/*")
public class ClassInfoServlet extends HttpServlet {
    IClassInfoService classInfoService = new ClassInfoServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;character=UTF-8");

        String URI = req.getRequestURI();
        String operation = URI.substring(URI.lastIndexOf("/")+1);
        switch (operation){
            case "":
            case "select":
                this.selectClassInfo(req,resp);
                break;
            case "add":
                this.addClassInfo(req,resp);
                break;
            case "toAdd":
                this.toAddClassInfo(req,resp);
                break;
            case "update":
                this.updateClassInfo(req,resp);
                break;
            case "toUpdate":
                this.toUpdate(req,resp);
                break;
            case "delete":
                this.deleteClassInfo(req,resp);
                break;
            default:
                break;
        }
    }

    private void deleteClassInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer classId = Integer.valueOf(req.getParameter("classId"));
        classInfoService.deleteClassInfo(classId);
        this.selectClassInfo(req,resp);
    }

    private void toUpdate(HttpServletRequest req, HttpServletResponse resp) {

    }

    private void updateClassInfo(HttpServletRequest req, HttpServletResponse resp) {

    }

    private void selectClassInfo(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("classInfoList",classInfoService.classInfos());
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }

    private void addClassInfo(HttpServletRequest req, HttpServletResponse resp) {

    }

    private void toAddClassInfo(HttpServletRequest req, HttpServletResponse resp) {

    }
}
