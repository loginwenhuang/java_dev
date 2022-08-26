package com.wen.demo.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageInfo;
import com.wen.demo.entity.CommonResult;
import com.wen.demo.entity.Goods;
import com.wen.demo.service.IGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 11:14
 */
@RestController
@RequestMapping("/Goods")
public class GoodsController {
    @Autowired
    private IGoodsService goodsService;

    //@ResponseBody
    @RequestMapping(path = "/goodsList")
    public String goodsList(int page,int limit){

        System.out.println("页码"+page);
        System.out.println("数据数"+limit);
        PageInfo<Goods> pageInfo = goodsService.goodsList(page,limit);

        String res = JSONObject.toJSONStringWithDateFormat(CommonResult.success(pageInfo.getList(), Math.toIntExact(pageInfo.getTotal())), "yyyy-MM-dd");
        System.out.println(res);
        return res;
    }

    //@ResponseBody
    @RequestMapping(path = "/add")
    public String goodsAdd(Goods goods){
        System.out.println(goods);
        int count=goodsService.goodsAdd(goods);
        System.out.println(count);
        if(count==1){
            return JSONObject.toJSONString(CommonResult.success());
        }
        return JSONObject.toJSONString(CommonResult.fail());
    }

    @RequestMapping("/update")
    public String goodsUpdate(Goods goods){
        return null;
    }
}
