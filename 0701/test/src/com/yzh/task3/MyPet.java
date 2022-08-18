package com.yzh.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:07
 */
public class MyPet {
    private String name;
    private int age;
    private String color;


    public void playWithOwner(){
        System.out.println("和主人一起玩!");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }
}
