package com.wen.test1;

import java.util.HashMap;

/**
 * @author :muxiaowen
 * @date : 2022/7/10 16:38
 */
public class Test2 {
    public static void main(String[] args) {
        Student s1 = new Student("张三",20);
        Student s2 = new Student("张三",20);
        System.out.println(s1.equals(s2));

        HashMap hashMap = new HashMap();
        hashMap.put("aaa",1000);
    }

}
