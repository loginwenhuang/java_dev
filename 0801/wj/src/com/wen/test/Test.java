package com.wen.test;

import com.wen.service.impl.ClassInfoServiceImpl;
import com.wen.service.impl.StudentServiceImpl;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 10:08
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(new StudentServiceImpl().allStudents());
        System.out.println(new ClassInfoServiceImpl().allClass());
    }
}
