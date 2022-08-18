package com.yzh.test5;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 16:40
 */
public class Test {
    public static void main(String[] args) {
        Student[] stu = new Student[10];
        int count = 0;
        int stuId;
        String name;
        int age;
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请选择:1.添加学生 2.修改学生 3.删除学生 4.查询单个学生 5.查询全部学生 6.退出");
            int choose = scanner.nextInt();
            switch (choose){
                case 1:
                    System.out.println("请输入学生姓名:");
                    name = scanner.next();
                    System.out.println("请输入学生年龄:");
                    age = scanner.nextInt();
                    stu[count++] = new Student(name,age);
                    break;
                case 2:
                    System.out.println("请输入学生学号:");
                    stuId = scanner.nextInt();
                    for (int i = 0; i < count; i++) {
                        if(stu[i].id==stuId&&!stu[i].name.equals("***")){
                            System.out.println("请输入学生姓名:");
                            name = scanner.next();
                            System.out.println("请输入学生年龄:");
                            age = scanner.nextInt();
                            stu[i].name= name;
                            stu[i].age = age;
                            System.out.println("修改后的学生信息》》\t姓名:"+stu[i].name+"\t年龄:"+stu[i].age);
                        }
                    }
                    break;
                case 3:
                    System.out.println("请输入学生学号:");
                    stuId = scanner.nextInt();
                    for (int i = 0; i < count; i++) {
                        if(stu[i].id==stuId){
                            stu[i].name = "***";
                            stu[i].age  = 0;
                            System.out.println("删除成功!");
                            break;
                        }
                    }
                    break;
                case 4 :
                    System.out.println("请输入学生学号:");
                    stuId = scanner.nextInt();
                    for (int i = 0; i < count; i++) {
                        if(stu[i].id==stuId&&!stu[i].name.equals("***")){
                            System.out.println("学生信息》》\t姓名:"+stu[i].name+"\t年龄:"+stu[i].age);
                            break;
                        }else {
                            System.out.println("查无此人!");
                        }
                    }
                    break;
                case 5:
                    System.out.println("全部学生的信息》》");
                    for (int i = 0; i < count; i++) {
                        if(!stu[i].name.equals("***")){
                            System.out.println("学号:"+stu[i].id+"\t姓名:"+stu[i].name+"\t年龄:"+stu[i].age);
                        }
                    }
                    break;
                case 6:
                    System.out.println("再会了!");
                    return;
                default:
                    System.out.println("未知指令!!!");
                    break;
            }
        }
    }
}
