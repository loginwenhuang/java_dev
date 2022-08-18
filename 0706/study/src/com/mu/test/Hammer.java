package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 9:02
 */
public class Hammer implements ITool{
    @Override
    public void knock(INut nut) {
        System.out.println("用锤子敲开坚果,"+nut.effect());
    }
}
