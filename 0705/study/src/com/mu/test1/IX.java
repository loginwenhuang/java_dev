package com.mu.test1;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 10:01
 */
public interface IX {
    int num  = 10;
    void x();

    public default void test1(){
        System.out.println("IX中的默认方法");
    }

    public static void  test2(){
        System.out.println("静态方法");
    }
}
