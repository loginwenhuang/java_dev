package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 10:26
 */
@Component("d")
public class Driver {
    @Value("保国")
    private String name;
    @Value("40")
    private int age;

    // @Autowired
    @Resource
    private Car car;

    public void drive(){
        System.out.println(name+"年龄"+age+"在开车!");
        car.run();
    }
}
