package com.wen.entity;

import com.wen.annotation.MyAnnotation;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 10:06
 */
@MyAnnotation(value = "张三",value1 = "男")
public class Student {
    private String name;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    public void eat(String food){
        System.out.println(this.name+"早饭吃"+food);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    @Deprecated
    public static void isEat(){
        System.out.println("吃了!");
    }
    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
