package com.mu.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 19:49
 */
public class Phone implements InternetEquipment{

    @Override
    public void accessWebSite(WebSite webSite) {
        System.out.println("使用手机上网!");
        webSite.show();
    }
}
