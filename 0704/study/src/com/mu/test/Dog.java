package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 9:02
 */
public class Dog extends Pet{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("小狗"+name+"吃骨头");
    }
    public void seeDoor(){
        System.out.println(name+"在看门");
    }
}
