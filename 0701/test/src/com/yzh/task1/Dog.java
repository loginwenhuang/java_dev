package com.yzh.task1;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 16:43
 */
public class Dog extends Pets{
    public Dog(String name,int health){
        super(name,health);
    }
    @Override
    public void eat(){
        System.out.print("小狗");
        super.eat();
        System.out.println("吃骨头!");
    }
}
