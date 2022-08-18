package com.yzh.test00;

/**
 * @author wen
 */
public class Test {
    public static void main(String[] args) {
        Farmer farmer1 = new Farmer("农夫a");
        Farmer farmer2 = new Farmer("农夫b");
        farmer1.pick();
        farmer2.pick();
        farmer1.pick();
        System.out.println("一共摘了"+ Farmer.count+"个西瓜!");
    }
}
