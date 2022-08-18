package com.yzh.task;

/**
 * @author wen
 */
public class Task10 {
    public static void main(String[] args) {
        int sum = 0,i=1;
        while (sum<500){
            sum += i+1+10*i++;
        }
        System.out.println(i);
    }
}
