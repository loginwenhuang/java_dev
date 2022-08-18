package com.wen.test;

import com.wen.entity.Goods;
import com.wen.service.IGoodsService;
import com.wen.service.impl.GoodsServiceImpl;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/30 9:26
 */
public class Test {
    public static void main(String[] args) {
        IGoodsService goodsService = new GoodsServiceImpl();
        List<Goods> goodsList = goodsService.goodsList();
        System.out.println(goodsList);
    }
}
