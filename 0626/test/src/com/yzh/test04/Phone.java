package com.yzh.test04;

/**
 * @author wen
 */
public class Phone {
    String brand;
    String color;
    int price;
    public Phone(String brand,String color,int price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }
    public String charge(int hours){
        System.out.println("为手机充电"+hours+"小时");
        if(hours<2){
            return "没充满";
        }
        if(hours<10){
            return "充满了";
        }
        return "充爆了";
    }
    public double call(String target,int min,double price){
        System.out.println("用"+this.brand+"手机给"+target+"打电话");
        System.out.println("打了"+min+"分钟，每分钟"+price+"元");
        double money = price*min;
        return money;
    }
}
