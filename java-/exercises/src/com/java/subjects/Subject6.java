package com.java.subjects;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 20:32
 */
public class Subject6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入4位会员号:");
        int vipId = scanner.nextInt();
        int random = (int) (Math.random()*10);
        System.out.println(((vipId/100%10)==random?"恭喜，你获得精美的MP3一个":"谢谢你的支持!"));
    }
}

