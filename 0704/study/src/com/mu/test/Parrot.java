package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 10:00
 */
public class Parrot extends Pet{
    public Parrot(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("鹦鹉"+name+"吃大米!");
    }
}
