package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 8:52
 */
public class Test {
    public static void main(String[] args) {
        Java  java = new Java();
        Html html = new Html();
        CShar cShar = new CShar();
        Student s = new Student("张三");
        s.study(java);
        s.study(html);
        s.study(cShar);
    }
}
