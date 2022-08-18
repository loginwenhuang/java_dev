package com.test;

import com.service.IGoodsService;
import com.service.impl.GoodsServiceImpl;
import org.junit.Test;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 9:08
 */
public class MyTest {

    public static void main(String[] args) throws IOException {
        IGoodsService goodsService = new GoodsServiceImpl();
        List<Map> goodsList = goodsService.goodsList();
        for (Map map:goodsList) {
            System.out.println(map);
        }
    }
    @Test
    public void test(){
        JunitTest junitTest = new JunitTest();
        junitTest.test2();
    }
}
