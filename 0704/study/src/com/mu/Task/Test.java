package com.mu.Task;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 17:23
 */
public class Test {
    public static void main(String[] args) {
        Piano p = new Piano("钢琴");
        Violin v = new Violin("小提琴");
        InstrumentTest it = new InstrumentTest();
        it.testPlay(p);
        it.testPlay(v);
    }
}
