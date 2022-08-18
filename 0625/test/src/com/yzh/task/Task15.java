package com.yzh.task;

/**
 * @author wen
 */
public class Task15 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            System.out.println("第"+i+"个月的兔子总数为："+fun(i));
        }

    }
    private static int fun(int n){
        if(n==1||n==2){
            return 1;
        }else {
            return  fun(n-1)+fun(n-2);
        }
    }
}
