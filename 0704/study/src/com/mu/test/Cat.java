package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 9:00
 */
public class Cat extends Pet{

    public Cat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println("小猫"+name+"吃小鱼");
    }

    public void catchMouse(){
        System.out.println(this.name+"抓到了老鼠");
    }
}
