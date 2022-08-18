package com.yzh.task;

/**
 * @author wen
 */
public class Task04 {
    public static void main(String[] args) {
        int sum = 0,i=1;
        while(sum<2000){
            sum += i++;
        }
        System.out.println(i);
    }
}
