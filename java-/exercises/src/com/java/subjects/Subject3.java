package com.java.subjects;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 20:13
 */
public class Subject3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字，计算各各位上的数字之和");
        String st = scanner.next();
        int sum = 0;
        for (int i = 0; i < st.length(); i++) {
            System.out.println("第"+(i+1)+"位上的数字是:"+st.charAt(i));
            sum += Integer.parseInt(String.valueOf(st.charAt(i)));
        }
        System.out.println("各个位上的数字之和:"+sum);
    }
}
