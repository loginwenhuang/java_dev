package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 9:03
 */
public class Person {
    private ITool iTool;
    public void eat(INut nut){
        iTool.knock(nut);
    }
    public void setiTool(ITool iTool) {
        this.iTool = iTool;
    }
}
