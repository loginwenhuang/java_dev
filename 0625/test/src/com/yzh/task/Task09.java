package com.yzh.task;

/**
 * @author wen
 */
public class Task09 {
    public static void main(String[] args) {
        int count =0;
        for (int i = 100; i < 1000; i++) {
            if((i/100+i%100/10+i%10)%12==0){
                count++;
            }
        }
        System.out.println(count);
    }
}
