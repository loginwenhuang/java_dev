package com.test;

import com.entity.Driver;
import com.sun.java.util.jar.pack.DriverResource_zh_CN;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 15:01
 */
public class Test1 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-1.xml");
        Driver driver = ac.getBean("xx", Driver.class);
        System.out.println(driver);
        driver.pet.show();
    }
}
