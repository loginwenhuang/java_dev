package com.yzh.test05;

/**
 * @author wen
 */
public class Test05b {

    public static void main(String[] args) {
        System.out.println(x);
        System.out.println(Test05b.x);
        Test05b t = new Test05b();
        System.out.println(t.num);
        Test05b.ccc();
    }
    int num;
    static int x;
    public void aaa(){
        System.out.println(num);
        ccc();
        System.out.println(x);
    }
    public static void ccc(){
        System.out.println(x);
    }
}
