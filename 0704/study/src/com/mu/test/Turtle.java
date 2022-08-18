package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 10:01
 */
public class Turtle extends Pet{
    public Turtle(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("乌龟"+name+"吃贝壳!");
    }
}
