package com.wen.test;

import com.wen.annotation.StuAnnotation;
import com.wen.entity.Student;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 10:00
 */
public class Test2 {
    public static void main(String[] args) {
        Class<Student> studentClass = Student.class;
        StuAnnotation annotation = studentClass.getAnnotation(StuAnnotation.class);
        System.out.println(annotation);
        for (int i = 0; i < annotation.nums().length; i++) {
            System.out.print(annotation.nums()[i]+"\t");
        }
        System.out.println();
        System.out.println("id:"+annotation.id());
        System.out.println("name:"+annotation.name());
        System.out.println("sex:"+annotation.sex());
        System.out.println("age:"+annotation.age());
        System.out.println("value:"+annotation.value());
    }
}
