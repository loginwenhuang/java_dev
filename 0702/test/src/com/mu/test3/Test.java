package com.mu.test3;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 11:56
 */
public class Test {
    public static void main(String[] args) {
        Pet p1 = new Dog("小狗","黄色");
        Pet p2 = new Cat("小猫","白色");
        p1.eat();
        p2.eat();
    }
}
