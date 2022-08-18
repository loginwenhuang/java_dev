package com.yzh.test5;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 16:31
 */
public class Student {
    int id;
    String name;
    int age;
    private static int n = 1001;
    public Student(){

    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = n;
        n++;
        System.out.println(this.name+"同学你的学号是:"+this.id);
    }
    public void introduce(){
        System.out.println(this.name+" "+this.age);
    }
}
