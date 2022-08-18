package com.yzh.task;

/**
 * @author wen
 */
public class Task14 {
    public static void main(String[] args) {
        int day = 10;
        int prev_day_count;
        int cur_day_count = 1;
        while(day>1){
            prev_day_count = (cur_day_count+1)*2;
            cur_day_count = prev_day_count;
            day--;
        }
        System.out.println(cur_day_count);
    }
}
