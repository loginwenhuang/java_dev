package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 9:00
 */
public class Dog extends Pet{
    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public  void eat() {
        System.out.println(this.color+this.name+"吃骨头!");
    }
}
