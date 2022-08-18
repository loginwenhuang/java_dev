package com.yzh.task;

/**
 * @author wen
 */
public class Task08 {
    public static void main(String[] args) {
        int count3 = 0,count5=0;
        for (int i = 1; i < 100; i++) {
            if(i%3==0){
                count3++;
            }
            if(i%5==0){
                count5++;
            }
        }
        System.out.println("能被三整除的个数:"+count3+"\n能被5整除的个数："+count5);
    }
}
