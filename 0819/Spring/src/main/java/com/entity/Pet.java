package com.entity;

import lombok.Data;

/**
 * @author :muxiaowen
 * @date : 2022/8/19 20:29
 */
@Data
public abstract class Pet {
    protected String name;
    protected String color;

    public abstract void introduce();
}
