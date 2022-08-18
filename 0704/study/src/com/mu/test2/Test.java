package com.mu.test2;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 11:47
 */
public class Test {
    public static void main(String[] args) {
        Info u1 = new Mouse();
        Info u2 = new KeyBoard();
        Computer computer = new Computer();

        computer.setUsb(u1);
        computer.setUsb(u2);
        computer.start();
        computer.start();
    }
}
