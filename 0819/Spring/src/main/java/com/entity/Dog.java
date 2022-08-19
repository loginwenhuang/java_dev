package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/19 20:30
 */
public class Dog extends Pet{
    @Override
    public void introduce() {
        System.out.println(this.color+this.name+",吃骨头!");
    }
}
