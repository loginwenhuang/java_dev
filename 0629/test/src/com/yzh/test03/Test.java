package com.yzh.test03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 11:45
 */
public class Test {
    public static void main(String[] args) throws ParseException {
        String str1 = "2014-7月8";
        String str2 = "2000-2月12";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM月dd");

        Date d1 = sdf.parse(str1);
        Date d2 = sdf.parse(str2);
        System.out.println(d1);
        DataUtil.timeDifference(d1,d2);
    }
}
