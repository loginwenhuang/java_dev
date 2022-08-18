package com.yzh.task;

import java.util.Scanner;

/**
 * @author wen
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("语文成绩");
        double chinese_mark = scanner.nextDouble();
        System.out.println("数学成绩");
        double math_mark = scanner.nextDouble();
        if(chinese_mark>=80&&math_mark>=80){
            System.out.println("奖励苹果笔记本");
        }else if(chinese_mark>=80&&math_mark>=70||chinese_mark>=70&&math_mark>=80){
            System.out.println("奖励iPhone xs手机");
        }else{
            System.out.println("思过");
        }
    }
}
