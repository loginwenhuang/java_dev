package com.mu.task1;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 17:55
 */
public class Gun implements Igun{
    String gun;

    public Gun(String gun) {
        this.gun = gun;
    }

    @Override
    public void used(String belong) {
        System.out.println(belong+"使用了"+gun);
    }
}
