package com.test;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 10:33
 */

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class Car {
    @Value("宝马")
    private String brand;
    @Value("20")
    private Integer price;
    @Value("80")
    private Double speed;

    public void run(){
        System.out.println("这辆速度为"+speed+"的"+brand+"车,价值"+price);
    }
}
