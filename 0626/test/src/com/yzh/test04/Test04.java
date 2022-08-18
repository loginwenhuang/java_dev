package com.yzh.test04;

/**
 * @author wen
 */
public class Test04 {
    public static void main(String[] args) {
        Phone p = new Phone("小米","黑色",2000);
        String res = p.charge(3);
        System.out.println(res);
        double money =  p.call("李四",20,0.5);
        System.out.println("一共花了"+money+"元");
    }
}
