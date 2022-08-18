package com.wen.test3_fx_tp;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 15:56
 */
public class Info2 {
    //泛型方法，无返回值
    public <T> void test(T val){
        System.out.println(val);
    }

    //返回字符串的泛型方法
    public <T> String test2(T val){
        return val.toString();
    }

    //返回任意类型的泛型方法
    public <T> T test3(T val){
        return val;
    }
}
