package com.mu.test3;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 11:58
 */
public class Cat extends Pet{

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.color+"的"+this.name+"正在吃大餐!");
    }
}
