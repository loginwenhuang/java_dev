package com.mu.test1;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 11:00
 */
public class SubClass extends ParentClass{
    public SubClass(String name) {
        super(name);
    }

    @Override
    public void test1() {
        System.out.println(name);
    }
}
