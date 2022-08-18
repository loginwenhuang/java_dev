package com.wen.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author :muxiaowen
 * @date : 2022/8/4 15:00
 */
//@WebListener
public class ContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext application = sce.getServletContext();
        System.out.println("上下文初始化/网站初始化:"+application);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("上下文销毁/网站销毁!");
    }
}
