package com.mu.task2;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 19:21
 */
public class Test {
    public static void main(String[] args) {
        BlackAndWhitePrinter blackAndWhitePrinter = new BlackAndWhitePrinter();
        ColorPrinter colorPrinter =new ColorPrinter();
        Master master = new Master("主人");
        Pets pets = new Pets("宠物");
        master.setPrinter(colorPrinter);
        pets.setPrinter(blackAndWhitePrinter);
        master.startPrinting();
        pets.startPrinting();
    }
}
