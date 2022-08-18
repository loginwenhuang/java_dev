package com.yzh.test00;

/**
 * @author wen
 */
public class Student {
    String name;
    int age;
    long phone;
    String hobby;

    public Student() {
    }

    public Student(String name, int age, long phone, String hobby) {
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.hobby = hobby;
    }

    public void intro(){
        System.out.println(this.name+"\n年龄"+this.age+"\n电话:"+this.phone+"\n爱好"+this.hobby);
    }
    public void  internet(int hour,int pay){
        System.out.println(this.name+"上网了"+hour+"小时,花了"+(pay*hour)+"元");
    }
}
