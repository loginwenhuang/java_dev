package com.wen.test2_fx;

import java.util.LinkedList;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 11:24
 */
public class Test2 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(123);
        list.add(321);
        //list.add("aaa");

        //泛型被擦除
        List list2 = list;
        list2.add("aaa");
        list2.add("ccc");

        System.out.println(list);
    }
}
