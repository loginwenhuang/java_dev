package com.yzh.test03;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 16:16
 */
public class Test2 {
    public static void main(String[] args) {
        Date d = new Date();
        System.out.println(d);
        SimpleDateFormat sdf = new SimpleDateFormat("G y-M-d E H:m:s S");
        String res = sdf.format(d);
        System.out.println(res);
    }
}
