package com.wen;

import com.alibaba.fastjson.JSONObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 17:38
 */
public class test {
    public static void main(String[] args) {
        Map map = new HashMap<>();
        map.put("name","张三");
        System.out.println(JSONObject.toJSONString(map));
    }
}
