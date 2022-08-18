package com.yzh.task;

/**
 * @author wen
 */
public class Task18 {
    public static void main(String[] args) {
        int pig;
        int bird;
        for (int i = 1; i < 25; i++) {
            if(i*2+80==110){
                pig = i;
                bird = 40-pig;
                System.out.println("猪:"+pig+"\n鸟:"+bird);
                break;
            }
        }

    }
}
