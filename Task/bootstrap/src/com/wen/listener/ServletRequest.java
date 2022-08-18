package com.wen.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * @author :muxiaowen
 * @date : 2022/8/4 15:34
 */
//@WebListener
public class ServletRequest implements ServletRequestListener {
    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        System.out.println("销毁!");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("创建!");
    }
}
