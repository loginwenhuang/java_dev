package com.entity;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 14:57
 */
@Component
public class Car {
    @Value("五菱")
    private String name;
    @Value("30")
    private Integer price;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
