package com.mu.task2;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 19:11
 */
public class BlackAndWhitePrinter implements Printer{
    private String name = "黑白打印机";
    @Override
    public void print() {
        System.out.println(name+"打印，打印黑白内容!");
    }
}
