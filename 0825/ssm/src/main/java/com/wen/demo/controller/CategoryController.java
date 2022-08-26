package com.wen.demo.controller;

import com.alibaba.fastjson.JSONObject;
import com.wen.demo.entity.Category;
import com.wen.demo.entity.CommonResult;
import com.wen.demo.service.ICategoryService;
import com.wen.demo.service.IGoodsService;
import org.apache.ibatis.annotations.Results;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 17:17
 */
//@Controller
@RestController
@RequestMapping("/category")
public class CategoryController {
    @Resource
    private ICategoryService categoryService;

    //@ResponseBody
    @RequestMapping(path = "/list/{a}")
    public String categoryNameList(@RequestParam("n") String name, @PathVariable("a") String s){
        List<Category> categoryList = categoryService.categoryList();

        return JSONObject.toJSONString(CommonResult.success(categoryList,categoryList.size()));
    }

    @RequestMapping("/add")
    public CommonResult add(Category category){
        System.out.println(category);
        int count= categoryService.insert(category);
        if(count==1){
            return CommonResult.success();
        }
        return CommonResult.fail();
    }

    @RequestMapping("/update")
    public CommonResult update(Category category){
        System.out.println(category);
        int count= categoryService.update(category);
        if(count==1){
            return CommonResult.success();
        }
        return CommonResult.fail();
    }

    @RequestMapping("/delete")
    public CommonResult delete(Integer categoryId){
        System.out.println(categoryId);
        int count = categoryService.delete(categoryId);
        if(count==1){
            return CommonResult.success();
        }
        return CommonResult.fail();
    }
    @RequestMapping("/test")
    public CommonResult test(){
        return CommonResult.success();
    }
}
