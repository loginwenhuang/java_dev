package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 15:37
 */
public class Dog extends Pet{
    @Override
    public void eat() {
        System.out.println(this.color+this.name+"吃骨头!");
    }
}
