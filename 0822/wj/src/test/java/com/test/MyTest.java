package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 9:08
 */
public class MyTest {
    @Test
    public void Test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-1.xml");
        com.entity.Driver driver = (com.entity.Driver) ac.getBean("driver");
        driver.drive();
    }
    @Test
    public void Test2(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-2.xml");
        Driver driver = (Driver) ac.getBean("d");
        driver.drive();
    }
}
