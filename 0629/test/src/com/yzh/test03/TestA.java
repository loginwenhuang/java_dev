package com.yzh.test03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 15:04
 */
public class TestA {
    public static void main(String[] args) {
        Date d =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String st = sdf.format(d);
        System.out.println(st);
    }
}
