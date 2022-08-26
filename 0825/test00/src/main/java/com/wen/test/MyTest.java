package com.wen.test;

import com.wen.service.IGoodsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 8:40
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ac =new ClassPathXmlApplicationContext("spring-mybatis.xml");
        IGoodsService bean = ac.getBean(IGoodsService.class);
        bean.goodsList().forEach(System.out::println);
    }
}
