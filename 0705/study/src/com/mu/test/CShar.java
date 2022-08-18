package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 9:01
 */
public class CShar extends Course{
    @Override
    public String skill(Student student) {
        System.out.println(student.name+"学习了C#");
        return "C#开发KTV系统";
    }
}
