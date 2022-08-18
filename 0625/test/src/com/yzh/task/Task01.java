package com.yzh.task;

import java.util.Scanner;

/**
 * @author wen
 */
public class Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("小明英语成绩：");
        int mark = scanner.nextInt();
        if(mark>=90){
            System.out.println("买台苹果笔记本！");
        }else if (mark>=70){
            System.out.println("买台iPhone4s手机！");
        }else if (mark>=60){
            System.out.println("买台纽曼Mp4y！");
        }else {
            System.out.println("思过！");
        }
    }
}
