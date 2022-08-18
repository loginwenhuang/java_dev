package com.yzh.test4;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 11:09
 */
public class Father {
    String name = "father";
    int money = 100;
    public Father(String name,int money){
        this.name = name;
        this.money = money;
    }
    public void setMoney(){
        System.out.println(this.name+"的资产:"+this.money);
    }
    public void liveHouse(){
        System.out.println("住茅草屋!");
    }
}
