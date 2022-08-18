package com.mu.test2;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 11:53
 */
public class Computer {
    private Info usb;
    public void start(){
        System.out.println("电脑开机了...");
        this.usb.work();
    }

    public void setUsb(Info usb) {
        this.usb = usb;
    }

}
