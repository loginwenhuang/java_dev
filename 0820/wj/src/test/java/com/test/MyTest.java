package com.test;

import com.entity.God;
import com.entity.Pet;
import com.entity.Student;
import com.factory.PetFactory;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 9:04
 */
public class MyTest {
    @Test
    public void petTest(){
       Pet pet = PetFactory.createPet("dog","小白","黑");
       pet.eat();

       Pet p = PetFactory.createPet("cat","小黑","白");
       p.eat();

       ApplicationContext ac =new ClassPathXmlApplicationContext("spring-1.xml");
       Student student = ac.getBean(Student.class);

       student.introduce();
    }

    @Test
    public void stuStaticTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-1.xml");
        Student stu = (Student)ac.getBean("stu");
        System.out.println(stu);
        stu.introduce();
    }
    @Test
    public void stuPublicTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-1.xml");
        Student stu = ac.getBean("stu2",Student.class);
        stu.introduce();
    }

    @Test
    public void godTest(){
        God god1 = God.createInstance();
        System.out.println(god1);

        God god2 = God.createInstance();
        System.out.println(god2);
    }

    @Test
    public void newStudent(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-2.xml");
        Student s1 = (Student) ac.getBean("student");
        System.out.println(s1);

        Student s2 = (Student) ac.getBean("s1");
        System.out.println(s2);

        Student s3 = ac.getBean(Student.class);
        System.out.println(s3);

        Student s4 = ac.getBean("s2",Student.class);
        System.out.println(s4);

        //针对单例对象会调销毁方法
        ((ClassPathXmlApplicationContext)ac).close();

    }

    @Test
    public void test(){

    }
}
