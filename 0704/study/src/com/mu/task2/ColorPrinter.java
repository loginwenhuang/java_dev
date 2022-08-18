package com.mu.task2;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 19:12
 */
public class ColorPrinter implements Printer{
    private String name = "彩色打印机";
    @Override
    public void print() {
        System.out.println(name+"打印，打印彩色内容!");
    }
}
