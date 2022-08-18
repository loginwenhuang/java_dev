package com.wen.servlet;

import com.alibaba.fastjson.JSONObject;
import com.wen.entity.CommonResult;
import com.wen.service.ICategoryService;
import com.wen.service.impl.CategoryServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/9 16:40
 */
@WebServlet(urlPatterns = "/CategoryServlet/*")
public class CategoryService extends HttpServlet {
    private ICategoryService categoryService = new CategoryServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset=utf-8");

        String uri =req.getRequestURI();
        String process = uri.substring(uri.lastIndexOf("/")+1);

        CommonResult res = null;

        switch (process){
            case "list":
                res = this.list(req,resp);
                break;
            default:
                break;
        }

        PrintWriter out = resp.getWriter();
        out.println(JSONObject.toJSONStringWithDateFormat(res,"yyyy-MM-dd"));
        out.flush();
        out.close();
    }

    private CommonResult list(HttpServletRequest req, HttpServletResponse resp) {
        List<Map<String,Object>> categoryList = categoryService.listCategory();
        if(categoryList.size()>0){
            return CommonResult.success(categoryList.size(),categoryList);
        }else {
            return CommonResult.fail();
        }
    }
}
