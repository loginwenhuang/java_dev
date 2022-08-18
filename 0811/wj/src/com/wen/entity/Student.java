package com.wen.entity;

import com.wen.annotation.StuAnnotation;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 9:01
 */
@StuAnnotation(id = 1,name = "张三",sex = "男",age = 24)
public class Student {
    private int id;
    private String name;
    private String sex;
    private int age;

    public Student() {
    }

    public Student(int id, String name, String sex, int age) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public void introduce(){
        System.out.println("我是"+this.name+"，我的学号是"+this.id+",我今年"+this.age+"。 性别:"+this.sex);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
