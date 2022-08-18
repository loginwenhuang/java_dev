package com.wen.test2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 11:20
 */
public class Test {
    public static void main(String[] args) {
        //16:初始容量
        Map map = new HashMap(16);
        //put:存储数据
        map.put("name","小成");
        map.put("age","20");
        map.put("people",new People("小成",20));
        map.put("wen",18);
        //键重复时，后面的数据覆盖前面的
        map.put("wen",20);
        map.put(20,"wen");

        //判断是否为空
        System.out.println(map.isEmpty());

        System.out.println(map);
        //实际存储的元素个数
        System.out.println(map.size());
        //根据键获取值
        System.out.println(map.get("people"));
        //判断是否包含某个键
        System.out.println(map.containsKey(20));
        //返回map中键的集合
        System.out.println(map.keySet());
        //返回map中值的集合
        System.out.println(map.values());

        //①：遍历键的集合
        Set set = map.keySet();
        for (Object obj:set) {
            System.out.println(obj +"  "+map.get(obj));
        }

        //②：遍历键值对集合
        Set entrySet = map.entrySet();
        for (Object o:entrySet) {
            //Map.Entry:Map接口的子接口，表示一个键值对对象
            Map.Entry kv = (Map.Entry) o;
            System.out.println(kv.getKey()+"==="+kv.getValue());
        }
    }
}
