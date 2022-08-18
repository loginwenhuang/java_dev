package com.yzh.task;

/**
 * @author wen
 */
public class Task11 {
    public static void main(String[] args) {
        double sum = 0;
        for (double i = 1; i <= 20;i++) {
            sum += (i*2-1)/i;
        }
        System.out.println(sum);
    }
}
