package com.wen.test1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 11:24
 */
public class Test {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        list.add(123);
        list.add(12.13);
        list.add(true);
        list.add(new Student("小成","男",19));

        System.out.println(list);
        System.out.println(list.get(6));

        list.remove("bbb");
        //Object obj = 123;
        //list.remove(obj);
        // 123 会被当作下标索引
        list.remove(123);
        list.remove(new Integer(123));
        System.out.println(list);

        list.remove(new Student("小成","男",19));
        System.out.println(list);
    }
}
