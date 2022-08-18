package com.yzh.test05;

/**
 * @author wen
 */
public class Student {
    String name;
    int age;
    static int x = 100;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void introduce(){
        System.out.println(this.name+" "+this.age+" "+ x);
    }
}
