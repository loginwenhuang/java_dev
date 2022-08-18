package com.yzh.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:17
 */
public class Cat extends MyPet{
    double weight;

    public Cat(String name, int age, String color,double weight) {
        setName(name);
        setAge(age);
        setColor(color);
        this.weight = weight;
    }
    public void catchMouse(){
        System.out.println(getName()+"在抓老鼠!");
    }
}
