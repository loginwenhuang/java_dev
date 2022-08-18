package com.wen.test;

import com.wen.entity.Student;

import java.lang.reflect.Field;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 16:55
 */
public class Test2 {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {

        Student student1 = new Student("张三","男",20);
        Field name = Student.class.getDeclaredField("name");
        System.out.println(name.getName());
        //设置可以访问私有字段
        name.setAccessible(true);

        System.out.println(name.get(student1));
        name.set(student1,"王五");
        System.out.println(name.get(student1));


    }
}
