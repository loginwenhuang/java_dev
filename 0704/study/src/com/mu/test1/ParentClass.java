package com.mu.test1;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 10:58
 */
public abstract class ParentClass {
    protected String name;
    public ParentClass(String name){
        this.name = name;
    }

    public void test(){
        System.out.println("大家好!");
    }

/** 抽象方法:
 *    1.用abstract修饰
 *    2.没有方法体，直接用分号结束
 *    3.抽象方法需要在子类中重写/实现
 */
    public abstract void test1();
}
