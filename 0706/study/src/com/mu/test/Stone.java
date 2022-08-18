package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/6 9:01
 */
public class Stone implements ITool{
    @Override
    public void knock(INut nut) {
        System.out.println("用石头敲开坚果,"+nut.effect());
    }
}
