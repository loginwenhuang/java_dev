package com.wen.servlet;

import com.mysql.cj.util.StringUtils;
import com.wen.entity.PageData;
import com.wen.entity.Worker;
import com.wen.service.IWorkerService;
import com.wen.service.impl.WorkerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author :muxiaowen
 * @date : 2022/8/2 9:15
 */
@WebServlet(urlPatterns = "/WorkerServlet/*")
public class WorkerServlet extends HttpServlet {
    private Integer pageNo = 1;
    private Integer pageSize = 3;
    private String  search;
    private String operation;
    IWorkerService workerService = new WorkerServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;character=UTF-8");

        String URI = req.getRequestURI();
        operation = URI.substring(URI.lastIndexOf("/")+1);
        switch (operation){
            case "":
            case "select":
                this.select(req,resp);
                break;
            case "insert":
                this.insert(req,resp);
                break;
            case "delete":
                this.delete(req,resp);
                break;
            case "update":
                this.update(req,resp);
                break;
            case "toAdd":
                this.toAdd(req,resp);
                break;
            case "toUpdate":
                this.toUpdate(req,resp);
                break;
            case "reset":
                this.toReset(req,resp);
                break;
            default:
                break;
        }
    }

    private void toReset(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        workerService.resetList();
        this.select(req,resp);
    }

    private void toUpdate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Integer id = Integer.valueOf(req.getParameter("id"));
        req.setAttribute("worker",workerService.selectById(id));
        req.getRequestDispatcher("/update.jsp").forward(req,resp);
    }

    private void toAdd(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req,resp);
    }

    private void update(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(!StringUtils.isNullOrEmpty(req.getParameter("search"))){
            search = req.getParameter("search");
        }
        Integer id = Integer.valueOf(req.getParameter("id"));
        String name = req.getParameter("name");
        String info = req.getParameter("info");
        Worker worker = new Worker(id,name,info);
        workerService.update(worker);
        this.select(req,resp);
    }

    private void delete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Integer id = Integer.valueOf(req.getParameter("id"));
        workerService.delete(id);
        this.select(req,resp);
    }

    private void insert(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(!StringUtils.isNullOrEmpty(req.getParameter("search"))){
            search = req.getParameter("search");
        }
        String name = req.getParameter("name");
        String info = req.getParameter("info");
        Worker worker = new Worker(name,info);
        workerService.insert(worker);
        this.select(req,resp);
    }

    private void select(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(!StringUtils.isNullOrEmpty(req.getParameter("search"))||"select".equals(operation)||StringUtils.isNullOrEmpty(operation)){
            search = req.getParameter("search");
        }
        try {
            pageNo = Integer.valueOf(req.getParameter("pageNo"));
        }catch (Exception ex){
            System.out.println("pageNo");
        }

        try {
            pageSize = Integer.valueOf(req.getParameter("pageSize"));
        }catch (Exception ex){
            System.out.println("pageSize");
        }
        System.out.println("搜索条件:"+search);
        System.out.println("第几页"+pageNo);
        System.out.println("每页数据"+pageSize);
        PageData pageData = workerService.listByPageAndSome(search,pageNo,pageSize);
        System.out.println(pageData);
        req.setAttribute("search",search);
        req.setAttribute("pageData",pageData);

        req.getRequestDispatcher("/main.jsp").forward(req,resp);
    }
}
