package com.java.subjects;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 20:45
 */
public class Subject7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入a的值:");
        int a = scanner.nextInt();
        System.out.print("请输入b的值:");
        int b =scanner.nextInt();
        System.out.print("请输入运算符（+、-、*、/）");
        String operator = scanner.next();
        switch (operator){
            case "+":
                System.out.println(a+operator+b+"="+(a+b));
                break;
            case "-":
                System.out.println(a+operator+b+"="+(a-b));
                break;
            case "*":
                System.out.println(a+operator+b+"="+(a*b));
                break;
            case "/":
                if(b==0){
                    System.out.println("除数不能为零!");
                }else{
                    System.out.println(a+operator+b+"="+(a/b));
                }
                break;
            default:
                System.out.println("无效的运算符!");
                break;
        }
    }
}
