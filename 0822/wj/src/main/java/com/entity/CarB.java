package com.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 9:03
 */
@Data
public class CarB {
    private String brand;
    private Integer price;
    private Double speed;

    public void run(){
        System.out.println("这辆速度为"+speed+"的"+brand+"车,价值"+price);
    }
}
