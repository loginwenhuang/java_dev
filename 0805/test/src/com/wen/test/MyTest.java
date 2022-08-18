package com.wen.test;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 10:40
 */
public class MyTest{
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("id",1000);
        map.put("name","张三");
        map.put("sex","男");

        System.out.println(map);
        System.out.println(JSONObject.toJSONString(map));
        JSONObject jsonArray = new JSONObject(map);
        System.out.println(jsonArray.get("id"));
    }
}
