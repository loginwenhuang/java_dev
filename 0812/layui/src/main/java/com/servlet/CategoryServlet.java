package com.servlet;

import com.alibaba.fastjson.JSONObject;
import com.entity.Category;
import com.entity.CommonResult;
import com.service.ICategoryService;
import com.service.impl.CategoryServiceImpl;

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
 * @date : 2022/8/17 18:49
 */
@WebServlet(urlPatterns = "/Category/*")
public class CategoryServlet extends HttpServlet {
    private ICategoryService categoryService = new CategoryServiceImpl();
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Category> categoryList = categoryService.categoryList();
        Object data = null;
        PrintWriter out = resp.getWriter();
        if(categoryList.size()>0){
            data = JSONObject.toJSONString(CommonResult.success(categoryList.size(),categoryList));
        }
        out.println(data);
        out.close();
    }
}
