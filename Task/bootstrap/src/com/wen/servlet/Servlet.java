package com.wen.servlet;

import com.mysql.cj.util.StringUtils;
import com.wen.entity.Student;
import com.wen.service.IBookService;
import com.wen.service.ILoginAndRegisterService;
import com.wen.service.IStudentService;
import com.wen.service.impl.BookServiceImpl;
import com.wen.service.impl.LoginAndRegisterService;
import com.wen.service.impl.StudentServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author :muxiaowen
 * @date : 2022/7/27 9:01
 */
public class Servlet extends HttpServlet {
    Student student;
    ILoginAndRegisterService loginAndRegisterService = new LoginAndRegisterService();
    IStudentService studentService = new StudentServiceImpl();
    IBookService bookService = new BookServiceImpl();
    private String REMEMBER_ME = "remember-me";
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String URI = req.getRequestURI();
        String process = URI.substring(URI.lastIndexOf("/")+1);
        System.out.println("地址:"+process);
        switch (process){
            case "index.jsp":
                this.index(req,resp);
                break;
            case "ToLoginServlet":
                this.toLoginServlet(req,resp);
                break;
            case "LoginServlet":
                this.loginServlet(req,resp);
                break;
            case "ToRegisterServlet":
                this.toRegisterServlet(req,resp);
                break;
            case "RegisterServlet":
                this.registerServlet(req,resp);
                break;
            case "main.jsp":
                this.mian(req,resp);
                break;
            case "ToMainServlet":
                this.toMainServlet(req,resp);
                break;
            case "ToModifyServlet":
                this.toModifyServlet(req,resp);
                break;
            case "ModifyUserInformationServlet":
                this.modifyUserInformationServlet(req,resp);
                break;
            case "Logout":
                this.logout(req,resp);
                break;
            default:
                break;
        }
    }

    private void mian(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer userId = (Integer) req.getServletContext().getAttribute("userId");
        String userName = (String) req.getServletContext().getAttribute("userName");
        System.out.println(userId);
        System.out.println("toMainServlet+userName:"+userName);
        if (userName!=null){
            req.setAttribute("userName",userName);
        }
        req.setAttribute("student",studentService.haveTheStu(userId));
        req.setAttribute("books",bookService.allBooks());
        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }

    private void logout(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession()!=null){
            req.getSession().invalidate();
            req.getServletContext().removeAttribute("userName");
            req.getServletContext().removeAttribute("userId");
            req.getServletContext().removeAttribute("Remind");
        }
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    private void toRegisterServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/register.jsp").forward(req,resp);
    }

    private void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    private void modifyUserInformationServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String stuName = req.getParameter("stuName");
        String sex = req.getParameter("sex");
        String birthday = req.getParameter("birthday");
        Integer userId = (Integer) req.getServletContext().getAttribute("userId");
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

    private void toModifyServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/userInformation.jsp").forward(req,resp);
    }

    private void registerServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        boolean flag = false;
        if(!loginAndRegisterService.checkUserName(userName)){
            if(loginAndRegisterService.userRegister(userName,password)){
                req.setAttribute("Remind",this.getInitParameter("success"));
                flag =true;
            }else {
                req.setAttribute("Remind",this.getInitParameter("fail"));
            }
        }else {
            req.setAttribute("Remind","用户名已被占用!");
        }
        req.setAttribute("flag",flag);
        req.getRequestDispatcher("/register.jsp").forward(req,resp);
    }

    private void toMainServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("登录成功!");
        req.getRequestDispatcher("/homePage.jsp").forward(req,resp);
    }

    private void loginServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String rememberMe = req.getParameter("rememberMe");
        System.out.println("rememberMe?:"+rememberMe);
        System.out.println("用户名:"+userName);
        System.out.println("密码:"+password);
        if(req.getServletContext().getAttribute("userName")!=null&&!"".equals(userName)){
            if(userName.equals(req.getServletContext().getAttribute("userName"))){
                req.getServletContext().setAttribute("Remind","用户"+userName+"已经被登录!");
                req.getRequestDispatcher("/login.jsp").forward(req,resp);
                return;
            }
        }
        int userId = loginAndRegisterService.userLogin(userName,password);
        if(userId>0){
            if(REMEMBER_ME.equals(rememberMe)){
                HttpSession session = req.getSession();
                session.setAttribute("userId",userId);
                session.setAttribute("userName",userName);
                System.out.println("session Id"+session.getId());
                System.out.println(session.getAttribute("userId"));
            }
            ServletContext application = req.getServletContext();
            application.setAttribute("userId",userId);
            application.setAttribute("userName",userName);
            application.removeAttribute("Remind");
            req.getRequestDispatcher("/Servlet/ToMainServlet").forward(req,resp);
        }else {
            System.out.println("登录失败!");
            req.setAttribute("message","登录失败!");
            req.getRequestDispatcher("/login.jsp").forward(req,resp);
        }
    }

    private void toLoginServlet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
/*        if(req.getServletContext().getAttribute("userName")!=null){
            req.setAttribute("Info","用户"+req.getServletContext().getAttribute("userName")+"未退出登录!");
            req.getRequestDispatcher("/index.jsp").forward(req, resp);
        }*/
        req.getServletContext().removeAttribute("Remind");
        if (req.getSession().getAttribute("userId") == null) {
            req.getRequestDispatcher("/login.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("/Servlet/ToMainServlet").forward(req, resp);
        }
    }
}
