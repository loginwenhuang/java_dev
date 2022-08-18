package com.yzh.task2;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:03
 */
public class Rabbit extends Animal{

    public Rabbit(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("是吃素的!");
    }
}
