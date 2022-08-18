package com.yzh.test2;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 10:14
 */
public class Test {
    public static void main(String[] args) {
        Student st  = new Student();
        st.setName("张三");
        st.setAge(-20);
        System.out.println(st.getName()+" "+st.getAge());
        Student st1  = new Student("李四",18);
        System.out.println(st1.getName()+" "+st1.getAge());

    }
}
