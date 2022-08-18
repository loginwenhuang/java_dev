package com.yzh.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:13
 */
public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("小成",8,"yellow","B");
        Cat cat = new Cat("成成",4,"gary",21.8);
        dog.playWithOwner();
        dog.doorMan();
        cat.playWithOwner();
        cat.catchMouse();
    }
}
