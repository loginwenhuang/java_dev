package com.yzh.task;

import java.util.Scanner;

/**
 * @author wen
 */
public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("星期？");
        String week = scanner.next();
        System.out.println("几号？");
        int day = scanner.nextInt();
        switch(week){
            case "星期一":
            case "星期二":
            case "星期四":
            case "星期五":
                System.out.println("上课");
                break;
            case "星期三":
                System.out.println("自习");
                break;
            case "星期六":
                System.out.println("爬山");
                break;
            case "星期天":
                if(day%2==0){
                    System.out.println("爬山");
                }else {
                    System.out.println("在家复习");
                }
                break;
        }
    }
}
