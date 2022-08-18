package com.wen.task;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 16:33
 */
public class Task {
    public static void lookUp(LinkedList stuList,int num){
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        if(num!=5){
            System.out.println("请输入学号:");
            id = scanner.nextInt();
        }
        for (Object stu: stuList) {
            Student student1 = (Student)stu;
            if(num==5){
                System.out.println(student1);
            }else if(student1.equals(id)){
                System.out.println("学生信息："+stu);
                if(num==2){
                    System.out.println("请依次输入修改的内容:姓名 性别 年龄");
                    student1.setName(scanner.next());
                    student1.setSex(scanner.next());
                    student1.setAge(scanner.nextInt());
                }else if(num==3){
                    stuList.remove(stu);
                }
                return;
            }
        }
        if(num!=5){
            System.out.println("没有找到学号为"+id+"的学生!");
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList stuList = new LinkedList();
        String s;
        while(true){
            System.out.println("1.添加\t2.修改\t3.删除\t4.查找\t5.遍历\t6.退出");
            switch (s=scanner.next()){
                case "1" :
                    System.out.println("依次输入：姓名 性别 年龄");
                    Student student = new Student(scanner.next(),scanner.next(),scanner.nextInt());
                    System.out.println("你的学号是:"+student.getStuId());
                    stuList.add(student);
                    break;
                case "2":
                case "3":
                case "4":
                case "5":
                    lookUp(stuList,Integer.valueOf(s));
                    break;
                case "6":
                    return;
                default:
                    System.out.println("输入错误");
                    break;
            }
        }
    }
}
