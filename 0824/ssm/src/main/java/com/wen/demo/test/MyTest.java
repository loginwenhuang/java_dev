package com.wen.demo.test;

import com.wen.demo.service.IGoodsService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 15:50
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext ac =new ClassPathXmlApplicationContext("spring-mybatis.xml");
        IGoodsService goodsService = ac.getBean(IGoodsService.class);
        System.out.println(goodsService.goodsList(2,5));
    }
}
