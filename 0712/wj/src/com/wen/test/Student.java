package com.wen.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 8:59
 */
public class Student {
    private String clas;
    private String name;
    private int age;

    public Student(String clas, String name, int age) {
        this.name = name;
        this.clas = clas;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClas() {
        return clas;
    }

    public void setClas(String clas) {
        this.clas = clas;
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
                ", clas='" + clas + '\'' +
                ", age=" + age +
                '}';
    }
}
