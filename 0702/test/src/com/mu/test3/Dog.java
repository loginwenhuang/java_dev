package com.mu.test3;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 11:57
 */
public class Dog extends Pet{

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println(this.color+"的"+this.name+"在吃...");
    }
}
