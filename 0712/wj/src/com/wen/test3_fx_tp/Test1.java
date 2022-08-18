package com.wen.test3_fx_tp;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 15:50
 */
public class Test1 {
    public static void main(String[] args) {
        Info<String> i1 = new Info<>();
        i1.setVar("wen");
        fun(i1);

        Info<Object> i2 = new Info<>();
        i2.setVar("mu");
        fun(i2);

    }
    public static void fun(Info<? super String> info){
        System.out.println(info);
    }
}
