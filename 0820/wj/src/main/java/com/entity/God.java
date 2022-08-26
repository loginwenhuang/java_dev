package com.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 10:43
 */
public class God {
    private static God god;

    private God(){}

    public static God createInstance(){
        if(god==null){
            god = new God();
        }
        return god;
    }
}
