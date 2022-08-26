package com.factory;

import com.entity.Student;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 17:12
 */
public class StudentFactory {
    public static Student createStu(){
        return new Student();
    }
}
