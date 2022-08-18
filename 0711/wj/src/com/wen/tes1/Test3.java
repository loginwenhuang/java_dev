package com.wen.tes1;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 10:31
 */
public class Test3 {
    public static void main(String[] args) {
        Set set = new TreeSet(new MyComparator());
        set.add(new Car("成拉里",300));
        set.add(new Car("丰",50));
        set.add(new Car("宝",100));

        set.add("aaa");
        System.out.println(set);
    }
}
