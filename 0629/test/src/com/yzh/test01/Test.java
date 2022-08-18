package com.yzh.test01;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 10:04
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(MyUtil.conUp("left"));
        String str1 = "border-top-width";
        String str2 = ": 1px;";
        //对String的方法的一些练习
        System.out.println(str1.length());
        System.out.println(str1.concat(str2));
        System.out.println(str1.charAt(10));
        System.out.println(str1.indexOf("a"));
        System.out.println(str1.substring(10));
        System.out.println(str1.substring(10,14));

        String[] st = str1.split("-");

        String res = "";

        for (int i = 0; i < st.length; i++) {
            if(i==0){
                res+=st[i];
            }else {
                res += MyUtil.conUp(st[i]);
            }
        }
        System.out.println(res);
    }
}
