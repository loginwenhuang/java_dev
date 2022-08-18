package com.mu.test3;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 16:43
 */
public class Test {
    public static void m1() throws Exception{

    }
    public static void m2() throws Exception {
        m1();
    }

    public static void main(String[] args) throws Exception {
        m2();
    }
}
