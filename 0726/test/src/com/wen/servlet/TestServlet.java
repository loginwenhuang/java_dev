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

/**
 * @author :muxiaowen
 * @date : 2022/7/26 16:07
 */
@WebServlet(name = "TestServlet" , value = "/Test")
public class TestServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        IStudentDao iStudentDao = new StudentDaoImpl();
        System.out.println("接收到了客户端发送的get请求");
        System.out.println(req.getContextPath());
        StringBuilder myHtml = new StringBuilder();
        myHtml.append("<html>");
        myHtml.append("<head>");
        myHtml.append("<title>my page</title>");
        myHtml.append("</head>");
        myHtml.append("<body><table border='1'>");
        myHtml.append("<tr>" +
                "   <td>学号</td>" +
                "   <td>姓名</td>" +
                "   <td>性别</td>" +
                "   <td>生日</td>" +
                "</tr>");
        if(iStudentDao.selectAllStu()!=null) {
            for (Student student : iStudentDao.selectAllStu()) {
                myHtml.append("<tr>" +
                        "   <td>"+student.getStuId()+"</td>" +
                        "   <td>"+student.getStuName()+"</td>" +
                        "   <td>"+student.getSex()+"</td>" +
                        "   <td>"+student.getBirthday()+"</td>" +
                        "</tr>");
            }
        }
        myHtml.append("</table></body>");
        myHtml.append("</html>");

        resp.setHeader("Content-type","text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        out.print(myHtml);
        out.flush();
        out.close();
    }
}
