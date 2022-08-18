package com.java.subjects;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 20:24
 */
public class Subject4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个数字:");
        int num = scanner.nextInt();
        System.out.println("你输入的数"+num+"是"+(num%2==0?"偶数。":"奇数。"));
    }
}
