package servlet;

import service.IStudentService;
import service.impl.StudentServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 15:23
 */
public class StudentServlet extends HttpServlet {
    private IStudentService studentService = new StudentServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("stuList",studentService.listAll());
        req.getRequestDispatcher("/test.jsp").forward(req,resp);
    }
}
