package com.test;

import com.entity.Cat;
import com.entity.Dog;
import com.entity.Pet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/19 20:36
 */
public class MyTest2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("com.entity.Dog");
        Pet pet = (Pet) aClass.newInstance();
        pet.setName("小白");
        pet.setColor("黑");
        pet.introduce();

        //Class<?> clazz = Class.forName("com.entity.Cat");
        //Pet p = (Pet) clazz.newInstance();
        ApplicationContext ac = new ClassPathXmlApplicationContext("test.xml");
        Pet p = ac.getBean(Cat.class);
        p.setName("小黑");
        p.setColor("白");
        p.introduce();
    }
}
