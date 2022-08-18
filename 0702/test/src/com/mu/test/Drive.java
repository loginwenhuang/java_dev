package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 9:58
 */
public class Drive extends Car{
    protected String driver;
    protected int age;

    public Drive(String driver,int age) {
        super();
        this.driver = driver;
        this.age = age;
    }

    @Override
    public void drive(Bus bus) {
        System.out.print(this.driver+"drive");
        super.drive(bus);
    }
    @Override
    public void drive(Taxi taxi) {
        System.out.print(this.driver+"drive");
        super.drive(taxi);
    }
}
