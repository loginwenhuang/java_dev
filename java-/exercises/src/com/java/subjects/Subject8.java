package com.java.subjects;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 20:53
 */
public class Subject8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("星期几的代号为：\n星期一：1\n星期二：2\n星期三：3\n星期四：4\n星期五：5\n星期六：6\n星期日：7\n\n");
        int num = scanner.nextInt();
        switch(num){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("工作愉快!");
                break;
            case 6:
            case 7:
                System.out.println("happy 周末!");
                break;
            default:
                break;

        }
    }
}
