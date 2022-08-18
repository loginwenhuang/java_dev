package com.yzh.test00;

/**
 * @author wen
 */
public class Farmer {
    String name;
    static int count = 0;

    public Farmer(String name){
        this.name = name;
    }
    public void  pick(){
        System.out.println(this.name+"摘了一个西瓜!");
        count++;
    }
}
