package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 9:02
 */
public class Html extends Course{
    @Override
    public String skill(Student student) {
        System.out.println(student.name+"学习了HTML");
        return "HTML开发网上花店";
    }
}
