package com.mu.test1;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 11:28
 */
public class Person extends Book{
    String name;
    int age;
    String sex;

    public Person() {
        super();
    }

    public Person(String name, int age, String sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                '}';
    }
}
