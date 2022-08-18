package com.yzh.task2;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:01
 */
public class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }
    public void eat(){
        System.out.print(this.name);
    }
    public void sleep(){
        System.out.println(this.name+"已经睡了!");
    }
}
