package com.mu.testA;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 14:05
 */
public class Student {
    String name;

    public Student(String name) {
        this.name = name;
    }
    public void study(ICourse course){
        System.out.println(this.name+course.skill());
    }
}
