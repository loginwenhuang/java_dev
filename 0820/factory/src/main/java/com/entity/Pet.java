package com.entity;

import lombok.Data;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 15:34
 */
@Data
public abstract class Pet {
    protected String name;
    protected String color;

    public abstract void eat();
}
