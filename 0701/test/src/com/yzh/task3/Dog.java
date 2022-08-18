package com.yzh.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:10
 */
public class Dog extends MyPet{
    String species;

    public Dog(String name, int age, String color,String species) {
        setName(name);
        setAge(age);
        setColor(color);
        this.species = species;
    }

    public void doorMan(){
        System.out.println(getName()+"在看门!");
    }
}
