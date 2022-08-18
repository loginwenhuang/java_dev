package com.java.subjects;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 19:57
 */
public class Subject1 {
    public static void main(String[] args) {
        double PI = 3.14;
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入圆柱的半径:");
        double r = scanner.nextDouble();
        System.out.print("请输入圆柱的高:");
        double h = scanner.nextDouble();
        System.out.print("此圆柱的体积为:"+(PI*r*r*h));
    }
}
