package com.mu.Task;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 17:15
 */
public class Instrument {
    String instrument;

    public Instrument(String instrument) {
        this.instrument = instrument;
    }

    public void play(){
        System.out.print("正在弹奏:");
    }
}
