package com.test;

import com.mapper.GoodsMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 19:49
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("springMVC.xml");
        GoodsMapper bean = ac.getBean(GoodsMapper.class);
        bean.select(null).forEach(System.out::println);
    }
}
