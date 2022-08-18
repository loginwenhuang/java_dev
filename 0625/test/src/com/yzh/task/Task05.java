package com.yzh.task;

/**
 * @author wen
 */
public class Task05 {
    public static void main(String[] args) {
        double sum = 0;
        double flag = -1;
        for (double i = 1; i <= 100; i++) {
            flag = flag*(-1);
            sum += flag*(1/i);
        }
        System.out.println(sum);
    }
}
