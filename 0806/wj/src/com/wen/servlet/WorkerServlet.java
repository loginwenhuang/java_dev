package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wen.service.IWorkerService;
import com.wen.service.impl.WorkerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author :muxiaowen
 * @date : 2022/8/6 9:08
 */
@WebServlet(urlPatterns = "/WorkerServlet")
public class WorkerServlet extends HttpServlet {
    private IWorkerService workerService = new WorkerServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        System.out.println("请求到了");
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");
        System.out.println(workerService.allWorker());
        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(workerService.allWorker(),"yyyy-MM-dd"));
        out.flush();
        out.close();
    }
}
