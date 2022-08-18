package com.yzh.test1;

import java.text.ParseException;
import java.util.Date;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 8:58
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个主字符串:");
        String st = scanner.next();
        System.out.println("请输入要查找的字符串:");
        String st1 = scanner.next();
        int count = 0;
        for (int i = 0; i <= st.length()-st1.length(); i++) {
            if(st1.equals(st.substring(i,i+st1.length()))){
                count++;
            }
        }
        System.out.println("查找的["+st1+"]在主字符串中出现了："+count+"次");


        System.out.println("请输入第一个日期字符串:");
        String st2 = scanner.next();
        System.out.println("请输入第二个日期字符串:");
        String st3 = scanner.next();
        Sdate.subDate(st2,st3);
    }
}
