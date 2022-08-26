package com.test;

import com.service.IGoodsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 17:16
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-MVC.xml");
        IGoodsService bean = ac.getBean(IGoodsService.class);
        bean.goodsList().forEach(System.out::println);
    }
}
