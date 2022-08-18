package com.wen.tes1;

import java.util.Set;
import java.util.TreeSet;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 10:19
 */
public class Test2 {
    public static void main(String[] args) {
        Set set = new TreeSet();
        set.add(new Student("小成",20));
        set.add(new Student("小温",20));
        set.add(new Student("小任",30));

        String s = "a";
        String s1 = "b";
        System.out.println(s.compareTo(s1));

        System.out.println(set);

        Student student = new Student("小温",17);
        System.out.println(student.compareTo(new Student("小成",18)));
    }
}
