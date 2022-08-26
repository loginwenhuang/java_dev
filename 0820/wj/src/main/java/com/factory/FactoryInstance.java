package com.factory;

import com.entity.Student;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 10:01
 */
public class FactoryInstance {
    public FactoryInstance() {
        System.out.println("创建了工厂");
    }
    public Student createInstance(){
        return new Student();
    }
}
