package com.wen.test4;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 16:30
 */
public class Test4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int result = add(a,b);
            System.out.println(result);
        }
        scan.close();
    }
    public static int add(int a, int b) {
        // TODO: 请在此编写代码
        int sum = a+b;
        return sum;
    }
}
