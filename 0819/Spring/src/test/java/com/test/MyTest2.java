package com.test;

import com.entity.Pet;

/**
 * @author :muxiaowen
 * @date : 2022/8/19 20:36
 */
public class MyTest2 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> aClass = Class.forName("com.entity.Dog");
        Pet pet = (Pet) aClass.newInstance();
        pet.setName("小白");
        pet.setColor("黑");
        pet.introduce();

        Class<?> clazz = Class.forName("com.entity.Cat");
        Pet p = (Pet) clazz.newInstance();
        p.setName("小黑");
        p.setColor("白");
        p.introduce();
    }
}
