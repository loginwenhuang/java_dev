package com.entity;

import lombok.Data;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 9:03
 */
@Data
public class Driver {
    private String name;
    private CarB car;
    public void drive(){
        System.out.println(this.name+"驾驶的"+car.getBrand()+"价值为"+car.getPrice()+"元,时速为"+car.getSpeed()+"km/h");
    }
}
