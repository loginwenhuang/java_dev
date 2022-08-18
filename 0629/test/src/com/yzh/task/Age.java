package com.yzh.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 18:04
 */
public class Age {
    static String st;
    public static void age(String str){
        st = str.substring(6,14);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate ld = LocalDate.parse(st,dtf);
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("y年M月d日");
        String res = ld.format(dtf2);
        LocalDate ld2 = LocalDate.now();
        Period p = Period.between(ld,ld2);
        System.out.println("生日:"+res+"\n年龄:"+p.getYears()+"岁");
    }
    public static void age2(String str) throws ParseException {
        st = str.substring(6,14);
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        Date d1 = sdf.parse(st);
        SimpleDateFormat sdf1 = new SimpleDateFormat("y年M月d日");
        String res = sdf1.format(d1);
        System.out.println("生日:"+res+"\n年龄:"+(date.getTime()-d1.getTime())/1000/3600/24/365+"岁");
    }
}
