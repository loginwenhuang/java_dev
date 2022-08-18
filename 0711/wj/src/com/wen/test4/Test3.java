package com.wen.test4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 16:14
 */
public class Test3 {
    public static void main(String[] args) {
        Map<String,People> map = new HashMap<>();
        map.put("张三",new People("张三",18));
        map.put("李四",new People("李四",19));
        Set<String> set = map.keySet();
        for (String s:set) {
            System.out.println(s+"  "+map.get(s));
        }
    }
}
