package com.yzh.task1;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 16:44
 */
public class Cat extends Pets{
    public Cat(String name,int health){
        super(name,health);
    }
    @Override
    public void eat(){
        System.out.print("小猫");
        super.eat();
        System.out.println("在吃小鱼!");
    }
}
