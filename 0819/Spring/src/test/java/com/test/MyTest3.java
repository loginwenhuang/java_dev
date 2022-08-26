package com.test;

import com.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 8:47
 */
public class MyTest3 {
    public static void main(String[] args) throws ClassNotFoundException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
        //Student student = (Student) ac.getBean(Class.forName("com.entity.Student"));
        Student student = ac.getBean(Student.class);
        student.setName("张三");
        student.setSex("男");
        student.setId(123);
        student.setPhone("10086123");

        System.out.println(student);
    }
}
