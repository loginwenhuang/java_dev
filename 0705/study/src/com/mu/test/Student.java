package com.mu.test;

import sun.plugin.dom.core.CoreConstants;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 9:02
 */
public class Student {
    String name;
    ICourse iCourse;
    public Student(String name) {
        this.name = name;
    }

    public void study(ICourse course){
        Course course1 = new Course();
        if(course instanceof Java){
            course1 = (Java)course;
            System.out.println(course1.course);
        }
        System.out.println(name+"学习了"+course1.course);
        System.out.println(this.name+"使用"+course.skill(this));
    }
}
