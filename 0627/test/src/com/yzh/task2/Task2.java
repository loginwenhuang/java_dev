package com.yzh.task2;

public class Task2 {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.name = "小成";
        programmer.yard_age = 5;
        programmer.position = "初级程序眼";
        programmer.introduce();
        programmer.programming("能吃的小猪佩奇");
        programmer.bug(1);
        System.out.println("加班费："+programmer.work_overtime(3,2.5));

        Programmer programmer1 = new Programmer();
        programmer1.name = "大J";
        programmer1.yard_age = 300;
        programmer1.position = ",高级工程架构师";
        programmer1.introduce();
        programmer1.programming("伟大的地球改造");
        programmer1.bug(10);
        System.out.println("加班费："+programmer1.work_overtime(5,100000));

        System.out.println("俩人加班费总和:"+(programmer.work_overtime(3,2.5)+programmer1.work_overtime(5,100000)));
    }
}
