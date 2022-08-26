package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 9:01
 */
public class Cat extends Pet{

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.color+this.name+"吃小鱼!");
    }
}
