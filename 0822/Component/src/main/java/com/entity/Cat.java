package com.entity;

import org.springframework.stereotype.Component;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 15:16
 */
@Component
public class Cat extends Pet{
    @Override
    public void show() {
        System.out.println("一只猫!");
    }
}
