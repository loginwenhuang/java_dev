package com.yzh.task;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 17:09
 */
public class SellTicket {
    String name;
    static int ticket = 100;

    public SellTicket(String name) {
        this.name = name;
    }

    public void sellTicket(){
        ticket--;
        System.out.println(this.name+"卖出一张票!");
    }
}
