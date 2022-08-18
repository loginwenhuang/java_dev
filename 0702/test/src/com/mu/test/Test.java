package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 8:41
 */
public class Test {
    public static void main(String[] args) {
        Bus b =new Bus("bus1","red",32);
        b.run();
        Taxi t = new Taxi("taxi1","green","出租车公司");
        t.run();
        Drive driver = new Drive("王师傅",20);
        driver.drive(b);
        driver.drive(t);
        System.out.println();


        System.out.println(Integer.valueOf('a'));
    }
}
