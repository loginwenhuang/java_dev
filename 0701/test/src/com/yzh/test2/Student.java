package com.yzh.test2;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 10:15
 */
public class Student {
    private String name;
    private int age;

    public Student(){
    }
    public Student(String name,int age){
        if(age>0&&age<120){
            this.name = name;
            this.age = age;
        }else {
            System.out.println("不是有效的年龄!");
        }
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        if (age<0||age>120){
            System.out.println("输入的年龄不合法!");
            return;
        }
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}
