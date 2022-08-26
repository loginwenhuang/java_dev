package com.wen.test;

import com.wen.entity.User;
import com.wen.service.ILoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 18:21
 */
public class MyTest {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        ILoginService bean = ac.getBean(ILoginService.class);
        User user = new User();
        user.setUserName("admin");
        user.setPassword("123456");
        int count = bean.userLogin(user);
        System.out.println(count);
    }
}
