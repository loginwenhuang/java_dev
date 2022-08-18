package com.yzh.task1;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 16:41
 */
public class Pets {
    String name;
    int health;
    public Pets(String name,int health){
        this.name = name;
        this.health = health;
    }
    public void eat(){
        System.out.print(this.name);
    }
}
