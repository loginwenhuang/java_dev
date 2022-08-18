package com.yzh.test03;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 16:37
 */
public class Test3 {
    public static void main(String[] args) {
        //获取当前日期时间的年月日，时分秒对象
        LocalDateTime ldt =LocalDateTime.now();
        System.out.println(ldt);
        //获取当前日期时间的年月日对象
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        //获取当前日期时间的时间对象
        LocalTime lt = LocalTime.now();
        System.out.println(lt);
        //日期格式化对象(SimpleDateFormat)
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日");
        //调用日期对象的格式化方法
        String res = dtf.format(ld);
        System.out.println(res);

        String s1 = "2010-01-01";
        String s2 = "2019-09-08";
        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        //转年月日时分秒时，中间用T间隔
        LocalDateTime ldt1 = LocalDateTime.parse("2022-01-01T12:12:12");
        System.out.println(ldt1);

        LocalDate ld1 =LocalDate.parse(s1,dtf2);
        LocalDate ld2 = LocalDate.parse(s2,dtf2);

        Period period = Period.between(ld1,ld2);
        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

    }
}
