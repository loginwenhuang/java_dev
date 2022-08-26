package com.test;

import com.mapper.CategoryMapper;
import com.mapper.GoodsMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 20:19
 */
public class Test2 {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        //ac.getBean(CategoryMapper.class).select(null).forEach(System.out::println);
        ac.getBean(GoodsMapper.class).goodsList().forEach(System.out::println);

        ac.getBean(CategoryMapper.class).categoryList();
    }
}
