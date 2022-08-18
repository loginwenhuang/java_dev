package com.yzh.task;

import java.util.Locale;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 17:47
 */
public class InitialsCapital {
    public static String iniCap(String str){
        String res = "";
        String[] sts = str.split("-");
        for (int i = 0; i < sts.length; i++) {
            if(i==0){
                res +=sts[i];
            }else{
                res += String.valueOf(sts[i].charAt(0)).toUpperCase()+sts[i].substring(1);
            }
        }
        return res;
    }
}
