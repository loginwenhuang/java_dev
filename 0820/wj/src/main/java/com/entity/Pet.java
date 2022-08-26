package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 8:59
 */
public abstract class Pet {
    protected String name;
    protected String color;

    public Pet(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public abstract void eat();
}
