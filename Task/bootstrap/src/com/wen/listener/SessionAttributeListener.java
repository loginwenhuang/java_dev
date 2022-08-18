package com.wen.listener;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;

/**
 * @author :muxiaowen
 * @date : 2022/8/4 15:29
 */
//@WebListener
public class SessionAttributeListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent se) {
        System.out.println("属性添加:"+se.getName()+"  "+se.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent se) {
        System.out.println("属性删除:"+se.getName()+"   "+se.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent se) {
        System.out.println("属性改变:"+se.getName()+"   "+se.getValue());
    }
}
