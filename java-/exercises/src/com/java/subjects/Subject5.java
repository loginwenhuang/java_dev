package com.java.subjects;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 20:28
 */
public class Subject5 {
    public static void main(String[] args) {
        int max;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入x的值:");
        int x = scanner.nextInt();
        System.out.print("请输入y的值:");
        int y = scanner.nextInt();
        max = x>y?x:y;
        System.out.print("请输入z的值:");
        int z = scanner.nextInt();
        max = max>z?max:z;
        System.out.println("这三个数中的最大值为:"+max);
    }
}
