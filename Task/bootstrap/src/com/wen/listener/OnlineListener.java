package com.wen.listener;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * @author :muxiaowen
 * @date : 2022/8/4 15:46
 */

/**
 * 记录在线人数
 * @author wen
 */
@WebListener
public class OnlineListener implements ServletContextListener, HttpSessionListener {
    private ServletContext application;
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("网页初始化!");
        application = sce.getServletContext();
        if(application.getAttribute("count")==null){
            application.setAttribute("count",0);
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("人数++");
        Integer count = (Integer) application.getAttribute("count");
        count++;
        System.out.println("count:"+count);
        application.setAttribute("count",count);
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("人数--");
        Integer count = (Integer) application.getAttribute("count");
        count--;
        application.setAttribute("count",count);
    }
}
