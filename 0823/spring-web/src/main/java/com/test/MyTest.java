package com.test;

import com.service.IGoodsService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 15:24
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        IGoodsService goodsService = ac.getBean(IGoodsService.class);
        goodsService.goodsList().forEach(System.out::println);
    }
}
