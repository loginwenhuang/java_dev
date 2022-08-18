package com.wen.test;

import com.aaa.util.DateConvertUtil;
import com.aaa.util.StringUtils;

import java.util.Date;

/**
 * @author :muxiaowen
 * @date : 2022/7/26 9:47
 */
public class MyTest1 {
    public static void main(String[] args) {
        System.out.println(StringUtils.isNullOrEmpty("a"));
        System.out.println(DateConvertUtil.getDate(new Date()));
        System.out.println(DateConvertUtil.getDate(new Date(),"yyyy-MM-dd HH:mm:ss"));
        System.out.println(DateConvertUtil.getDate("2010-1-1"));
    }
}
