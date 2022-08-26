package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 15:36
 */
public class Cat extends Pet{
    @Override
    public void eat() {
        System.out.println(this.color+this.name+"吃小鱼!");
    }
}
