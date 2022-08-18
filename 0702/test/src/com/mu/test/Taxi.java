package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 9:03
 */
public class Taxi extends Car{
    private String company;

    public Taxi(String name, String color,String company) {
        super(name, color);
        this.company =company;

    }

    @Override
    public void run() {
        super.run();
        System.out.print("将客人拉到目的地\n");
    }
//    }
}
