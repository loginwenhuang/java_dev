package com.yzh.test02;

/**
 * @author :muxiaowen
 * @date : 2022/6/29 11:07
 */
public class Test1 {
    public static void main(String[] args) {
        for (int i = 100; i <1000; i++) {
            StringBuffer stringBuffer = new StringBuffer(String.valueOf(i));
            String str = stringBuffer.toString();
            if(str.equals(stringBuffer.reverse().toString())){
                System.out.println(i);
            }
        }
    }
}
