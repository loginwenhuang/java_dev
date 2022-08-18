package com.wen.servlet;

import com.wen.dao.IStudentDao;
import com.wen.dao.impl.StudentDaoImpl;
import com.wen.enity.Student;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 8:24
 */
@WebServlet(urlPatterns = "/xxx")
public class MyServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        StringBuilder myHtml = new StringBuilder();
        IStudentDao iStudentDao = new StudentDaoImpl();
        List<Student> students = iStudentDao.selectAllStu();
        myHtml.append("<table border='1'>");
        for (Student s:students) {
            myHtml.append("<tr>");
            myHtml.append("<td>"+s.getStuId()+"</td>");
            myHtml.append("<td>"+s.getStuName()+"</td>");
            myHtml.append("<td>"+s.getSex()+"</td>");
            myHtml.append("<td>"+s.getBirthday()+"</td>");
            myHtml.append("</tr>");
        }
        myHtml.append("</table>");

        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("Content-type","text/html;charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.print(myHtml);
        out.flush();
        out.close();
    }
}
