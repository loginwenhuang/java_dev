package com.test;

import com.entity.Pet;
import com.entity.Student;
import com.factory.PetFactory;
import com.factory.StudentFactory;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 15:43
 */
public class MyTest {
    @Test
    public void petTest() throws IllegalAccessException, InstantiationException, ClassNotFoundException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("宠物的类型:");
        String clsName = scanner.next();
        System.out.println("宠物名:");
        String name = scanner.next();
        System.out.println("宠物颜色:");
        String color = scanner.next();

        Pet pet = PetFactory.createInstance(clsName,name,color);
        pet.eat();
    }
    @Test
    public void stuTest(){
        //创建spring容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过spring容器获取在其中定义过的bean对象，由此实现了控制反转
        Student student = ac.getBean(Student.class);
        student.introduce();
    }

    @Test
    public void stu2Test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

        Student stu2 = (Student)ac.getBean("stu");
        System.out.println(stu2);

        Student stu3 = (Student) ac.getBean("stu1");
        System.out.println(stu3);

        Student stu4 = ac.getBean("stu2",Student.class);
        System.out.println(stu4);

        Student stu5 = (Student) ac.getBean("staticFac");
        System.out.println(stu5);

        Student stu6 = (Student) ac.getBean("s");
        System.out.println(stu6);
    }

    @Test
    public void facTest(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-2.xml");
        Student stu1 = ac.getBean(Student.class);
        System.out.println(stu1);
        Student stu2 = ac.getBean(Student.class);
        System.out.println(stu2);
        Student stu3 = ac.getBean(Student.class);
        System.out.println(stu3);
        Student stu4 = ac.getBean(Student.class);
        System.out.println(stu4);
        Student stu5 = ac.getBean(Student.class);
        System.out.println(stu5);
    }

    @Test
    public void singleStu(){
        Student stu1 = Student.createStudent();
        System.out.println(stu1);

        Student stu2 = Student.createStudent();
        System.out.println(stu2);
    }

    @Test
    public void Test(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-2.xml");

        ((ClassPathXmlApplicationContext)ac).close();
    }

    @Test
    public void BeanFactoryTest(){
        Resource re = new ClassPathResource("spring-2.xml");
        BeanFactory bf = new XmlBeanFactory(re);
        Student stu = bf.getBean(Student.class);
        System.out.println(stu);
    }
}
