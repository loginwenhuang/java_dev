package com.yzh.task2;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:05
 */
public class AnimalTest {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit("兔子");
        Tiger tiger = new Tiger("老虎");
        rabbit.eat();
        tiger.eat();
        rabbit.sleep();
        tiger.sleep();
    }
}
