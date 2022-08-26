package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 16:21
 */
public class Student {
    private static Student student;
    public Student(){
        System.out.println("创建了一名学生!");
    }
    public static Student createStudent(){
        if(student==null){
            student = new Student();
        }
        return student;
    }
    public void introduce(){
        System.out.println("我是一名学生!");
    }
    public void close(){
        System.out.println("再见了!");
    }
}
