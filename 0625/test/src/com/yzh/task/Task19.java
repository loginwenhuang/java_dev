package com.yzh.task;

/**
 * @author wen
 */
public class Task19 {
    public static void main(String[] args) {
        int adult;
        int child;
        for (int i = 0; i < 33; i++) {
            if (i * 8 == 200) {
                adult = i;
                child = 100 - i;
                System.out.println("大人:" + adult + "\n小孩:" + child);
                break;
            }
        }
    }
}
