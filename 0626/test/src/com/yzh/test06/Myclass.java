package com.yzh.test06;

/**
 * @author wen
 */
public class Myclass {
    int num;
    {
        System.out.println("实例代码块被执行");
    }
    static {
        System.out.println("静态代码块被执行");
    }
    public Myclass(){
        System.out.println("构造方法被执行");
    }
}
