package com.mu.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 19:53
 */
public class Test {
    public static void main(String[] args) {
        WebSite ws1 = new BaiDu();
        WebSite ws2 = new WangYi();
        InternetEquipment iq1 = new Phone();

        Person p = new Person("张三");
        p.setInternetEquipment(iq1);
        p.getOnline(ws1);
    }
}
