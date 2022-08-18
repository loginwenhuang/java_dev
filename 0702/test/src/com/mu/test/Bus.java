package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 9:01
 */
public class Bus extends Car{
    private int maxNum;

    public Bus(String name, String color,int maxNum) {
        super(name, color);
        this.maxNum = maxNum;
    }

    @Override
    public void run(){
        super.run();
        System.out.println("(载客量: "+this.maxNum+")"+"开往下一站");
    }
}
