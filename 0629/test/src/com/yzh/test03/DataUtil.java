package com.yzh.test03;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 11:46
 */
public class DataUtil {
    public static void timeDifference(Date x,Date y){
        long n = x.getTime()-y.getTime();
        System.out.println("相差的年份："+n/1000/3600/24/365);
        System.out.println("相差的月份："+n/1000/3600/24/365*12);
        System.out.println("相差的天数："+n/1000/3600/24);
    }
}
