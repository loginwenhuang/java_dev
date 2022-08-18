package com.test;

import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author :muxiaowen
 * @date : 2022/8/14 19:44
 */
public class JunitTest {
    @BeforeClass
    public static void test1(){
        System.out.println("beforeclass");
    }

    @Test
    public void test2(){
        System.out.println("测试内容");
    }
}
