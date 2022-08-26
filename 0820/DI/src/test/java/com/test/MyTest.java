package com.test;

import com.wen.Hobby;
import com.wen.Person;
import com.wen.Student;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/21 21:07
 */
public class MyTest {
    @Test
    public void diTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-1.xml");
        Student stu = ac.getBean("stu", Student.class);
        System.out.println(stu);
    }
    @Test
    public void refTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-2.xml");
        Person p = ac.getBean("p", Person.class);
        System.out.println(p);
    }
    @Test
    public void n_vTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-3.xml");
        Hobby hobby = ac.getBean("hobby", Hobby.class);
        System.out.println(hobby);
    }
}
