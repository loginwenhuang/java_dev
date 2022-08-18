package com.yzh.test1;

public class Student {
    String name;
    String sex;
    int age;
    double tall;
    String school;

    public void eat(){
        System.out.println(this.name+"在吃早饭");
        return ;
    }
    public void study(String scroll){
        System.out.println(this.age+"岁的"+this.school+"的学生"+this.name+"在学"+scroll);
    }
    public int rabbit(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return rabbit(n-2)+rabbit(n-1);
        }
    }
    public Student(){
        System.out.println("无参构造");
    }
    public Student(String name,String sex){
        this.name = name;
        this.sex = sex;
        System.out.println("有参构造："+this.name+"\n"+this.sex+this.age+this.school);
    }
    public Student(String name,String sex,int age,double tall,String school){
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tall = tall;
        this.school = school;
        System.out.println(this.name+this.sex+this.age+this.tall+this.school);
    }
}
