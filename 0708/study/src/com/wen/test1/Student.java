package com.wen.test1;

import java.util.Objects;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 11:24
 */
public class Student {
    String name;
    String sex;
    int age;

    public Student(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        System.out.println("====重写equals===");
        if(this == obj){
            return true;
        }
        if(obj instanceof Student){
            Student student = (Student) obj;
            if(student.toString().equals(this.toString())){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
