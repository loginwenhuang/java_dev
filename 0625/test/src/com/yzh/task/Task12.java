package com.yzh.task;

/**
 * @author wen
 */
public class Task12 {
    public static void main(String[] args) {
        int age_son = 12,age_father = 25;
        for (;;) {
            if(age_father==age_son*2){
                System.out.println((age_son-12)+"年\n父亲的年龄："+age_father+"\n儿子的年龄："+age_son);
                break;
            }
            age_father++;
            age_son++;
        }
    }
}
