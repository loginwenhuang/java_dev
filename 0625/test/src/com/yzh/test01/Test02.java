package com.yzh.test01;

/**
 * @author wen
 */
public class Test02 {
    public static void main(String[] args) {
        byte a = 10;
        int b = 20;
        b = a;
        System.out.println(b);

        b = 10;
        double c = 3.14;
        c = b;
        System.out.println(c);

        char d = 'd';
        b = d;
        System.out.println(b);

        a = 10;
        b = 20;
        long e = 30;
        long f = a + b + e;
        System.out.println(f);

        b = 10;
        float j = 3.14F;
        float h = b/j;
        System.out.println(h);

        b = 300;
        a = 5 ;
        a = (byte) b;
        System.out.println(a);

        c = 3.14;
        b = 2;
        b = (int)c;
        System.out.println(b);

        b = 65636;
        d = 'a';
        d = (char)b;
        System.out.println(d);

        short i = 5;
        i = (short) (i + 5);
        i+=5;
        System.out.println(i);
    }
}
