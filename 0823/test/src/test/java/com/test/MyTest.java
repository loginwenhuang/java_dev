package com.test;

import com.mapper.GoodsMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 8:36
 */
public class MyTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ac.getBean(GoodsMapper.class).goodsList().forEach(System.out::println);
    }
}
