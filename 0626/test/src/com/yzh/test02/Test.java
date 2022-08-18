package com.yzh.test02;

import com.yzh.test01.Calc;

/**
 * @author wen
 */
public class Test {
    public static void main(String[] args) {
        Sum sum =new Sum();

        Calc calc = new Calc();

        sum.add(2,5);
        System.out.println(sum.add(5.5,5));
        sum.add(5,6.5);
        System.out.println(sum.add(1,2,3));
        sum.add("a","b");
    }
}
