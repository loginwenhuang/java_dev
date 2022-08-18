package com.mu.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 19:49
 */
public class Person {
    String name;
    InternetEquipment internetEquipment;

    public Person(String name) {
        this.name = name;
    }

    public void getOnline(WebSite webSite){
        internetEquipment.accessWebSite(webSite);
    }
    public void setInternetEquipment(InternetEquipment internetEquipment) {
        this.internetEquipment = internetEquipment;
    }
}
