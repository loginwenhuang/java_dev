package com.mu.Task;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 17:21
 */
public class Violin extends Instrument{

    public Violin(String instrument) {
        super(instrument);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(instrument);
    }
}
