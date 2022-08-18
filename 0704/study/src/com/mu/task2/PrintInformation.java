package com.mu.task2;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 19:13
 */
public class PrintInformation {
    String name;
    Printer printer;

    public PrintInformation(String name) {
        this.name = name;
    }
    public void startPrinting(){
        System.out.print(name+"的详细信息使用");
        printer.print();
    }
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
