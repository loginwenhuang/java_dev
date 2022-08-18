package com.wen.test1;

import java.util.Objects;

/**
 * @author :muxiaowen
 * @date : 2022/7/10 16:05
 */
public class Student {
    private String name;
    private int age;

    public Student(){
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //重写equals
    @Override
    public boolean equals(Object o) {
        if(this==o){
            return true;
        }
        if(!(o instanceof Student)){
            return false;
        }

        Student student = (Student) o;
        if(Objects.equals(this.name,student.getName()) &&
                Objects.equals(this.age,student.age)){
            return true;
        }
        return false;
    }

    //重写hashCode,返回hash值，通过hash值得到要存储到数组的下标
    //hash值一样的数据存储到同一个数组空间，后再用equals进行内容比较

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
                ", age=" + age +
                '}';
    }
}
