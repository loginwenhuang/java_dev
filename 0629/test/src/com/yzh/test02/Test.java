package com.yzh.test02;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 9:48
 */
public class Test {
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1.equals(str3));

        StringBuffer sb = new StringBuffer();
        StringBuffer sb1 = sb.append("abc");
        sb.append("abc");
        System.out.println(sb);
    }
}
