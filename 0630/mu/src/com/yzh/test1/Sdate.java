package com.yzh.test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 9:14
 */
public class Sdate {
    public static void subDate(String st1,String st2) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-ss");
        java.util.Date d1 = sdf.parse(st1);
        java.util.Date d2 = sdf.parse(st2);
        while (true){
            System.out.println("请选择求差单位：1.年 2.月 3.日 4.退出");
            int s = scanner.nextInt();
            int n = 0;
            switch (s){
                case 1 :
                    n = (int) ((d2.getTime()-d1.getTime())/1000/3600/24/365);
                    System.out.println("两个日期差了:"+n+"年");
                    break;
                case 2 :
                    n = (int) ((d2.getTime()-d1.getTime())/1000/3600/24/30);
                    System.out.println("两个日期差了:"+n+"月");
                    break;
                case 3 :
                    n = (int) ((d2.getTime()-d1.getTime())/1000/3600/24);
                    System.out.println("两个日期差了:"+n+"日");
                    break;
                case 4 :
                    System.out.println("结束!");
                    return;
                default:
                    System.out.println("输入错误!");
                    break;

            }
        }
    }
}
