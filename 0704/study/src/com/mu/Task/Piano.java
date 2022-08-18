package com.mu.Task;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 17:19
 */
public class Piano extends Instrument{

    public Piano(String instrument) {
        super(instrument);
    }

    @Override
    public void play() {
        super.play();
        System.out.println(instrument);
    }
}
