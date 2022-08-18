package com.wen.task;

import java.util.Objects;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 16:34
 */
public class Student {
    String name;
    String sex;
    static int Id = 1000;
    int age;
    int stuId;


    public Student(String name, String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.stuId = ++Id;
    }

    public boolean equals(int stuId) {
        System.out.println("=====");
        if(this.getStuId()==stuId){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, stuId, age);
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

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStuId() {
        return stuId;
    }

    public void setStuId(int stuId) {
        this.stuId = stuId;
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
                "姓名='" + name + '\'' +
                ", 性别='" + sex + '\'' +
                ", 学号=" + stuId +
                ", 年龄=" + age +
                '}';
    }
}
