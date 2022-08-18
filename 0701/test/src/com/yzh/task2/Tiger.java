package com.yzh.task2;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:04
 */
public class Tiger extends Animal{
    public Tiger(String name) {
        super(name);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("可不是吃素的!");
    }
}
