package com.mu.test1;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 11:25
 */
public class Test {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 12;
//        int c = 130;
//        int d = 130;
//        System.out.println(a==b&&c==d);
//        Integer aa = a;
//        Integer bb = b;
//        Integer cc = c;
//        Integer dd = d;
//        aa = Integer.valueOf(a);
//        System.out.println(aa==bb);
//        System.out.println(cc==dd);
//        System.out.println(cc.equals(dd));
//
//        Integer ee = 200;
//        int e = ee;
//        System.out.println(e);
//
//        String st  = "150";
//        ee = Integer.valueOf(st);
//        System.out.println(ee);
        Integer a = 100;
        //'Integer(int)' is deprecated 已弃用
        Integer b = new Integer(100);
        System.out.println(a==b);
        Integer c = 200;
        Integer d = 200;
        Integer.valueOf(10);
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(a.toString());
    }
}
