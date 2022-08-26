package com.factory;

import com.entity.Student;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 17:27
 */
public class Factory {
    public Student createStu(){
        return new Student();
    }
}
