package com.yzh.task;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 17:08
 */
public class Task1 {
    public static void main(String[] args) {
        SellTicket sellTicket = new SellTicket("小成");
        SellTicket sellTicket1 = new SellTicket("小温");
        sellTicket.sellTicket();
        sellTicket1.sellTicket();
    }
}
