package com.factory;

import com.entity.Student;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 9:59
 */
public class StaticFactory {
    public StaticFactory() {
        System.out.println("创建了工厂");
    }

    public static Student createInstance(){
        return new Student();
    }
}
