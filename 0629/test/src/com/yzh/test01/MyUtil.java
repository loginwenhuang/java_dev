package com.yzh.test01;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 10:05
 */
public class MyUtil {
    public static String conUp(String str){
        String firstLetter = String.valueOf(str.charAt(0)).toUpperCase();
        String otherLetter = str.substring(1);
        return firstLetter+otherLetter;
    }
}
