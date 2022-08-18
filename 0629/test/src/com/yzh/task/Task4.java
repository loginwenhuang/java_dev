package com.yzh.task;

import javax.swing.text.Style;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 18:22
 */
public class Task4 {
    public static void main(String[] args) {
        String st = "mu-xiao-wen-zai-ci ";
        System.out.println(st.length());
        System.out.println(st.charAt(0));
        System.out.println(st.equals("mu-xiao-wen"));
        System.out.println(st.substring(3));
        System.out.println(st.substring(0,3));
        System.out.println(st.trim());

        System.out.println(st.replace("-","*"));
        System.out.println(st.split("-"));
        System.out.println(st.endsWith("i"));
        System.out.println(st.startsWith("m"));

        System.out.println(st.concat("!!!"));
    }
}
