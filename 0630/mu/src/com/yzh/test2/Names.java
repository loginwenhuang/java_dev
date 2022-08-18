package com.yzh.test2;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 10:24
 */
public class Names {
    public static void name(){
        Scanner scanner = new Scanner(System.in);

        String[] sts = new String[3];
        for (int i = 0; i < sts.length; i++) {
            System.out.println("请输入第"+(i+1)+"个人的名字:");
            sts[i] = scanner.next();
        }
        for (String name : sts){
            System.out.println(name);
        }
    }
}
