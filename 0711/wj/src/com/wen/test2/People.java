package com.wen.test2;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 11:20
 */
public class People {
    String name;
    int age;

    public People(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
