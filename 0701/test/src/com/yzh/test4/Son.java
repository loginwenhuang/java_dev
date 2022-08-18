package com.yzh.test4;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 11:11
 */
public class Son extends Father{
    String name = "son";

    public Son(String name, int money) {
        super(name, money);
    }

    @Override
    public void liveHouse() {
        System.out.println("不住茅草屋!");
    }
}
