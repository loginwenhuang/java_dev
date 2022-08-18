package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 8:47
 */
public class Test {
    public static void main(String[] args) {
        Master m = new Master("小明");
        Cat c = new Cat("花花");
        Dog d = new Dog("旺财");
        Parrot p = new Parrot("大成");
        Turtle t = new Turtle("小成");
        m.feed(c);
        m.feed(d);
        m.feed(p);
        m.feed(t);

        //向上转型
        Pet p1 = new Dog("老成");
        p1.eat();
    }
}
