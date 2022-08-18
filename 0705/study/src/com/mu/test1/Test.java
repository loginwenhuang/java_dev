package com.mu.test1;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 10:01
 */
public class Test {
    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.x();
        System.out.println(IX.num);

        IX a = new MyClass1();
        a.test1();
        IX.test2();

        mc.test1();
        MyClass1 mc1 = new MyClass1();
        mc1.test1();
    }
}
