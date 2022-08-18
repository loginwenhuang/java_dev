package com.wen.test;

import com.wen.entity.Student;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Calendar;
import java.util.Properties;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 20:16
 */
@SuppressWarnings("all")
public class Test7 {
    public static void main(String[] args) throws IOException, NoSuchFieldException, IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException {
        Properties properties = new Properties();
        InputStream resourceAsStream = Test7.class.getClassLoader().getResourceAsStream("stu.properties");
        properties.load(new InputStreamReader(resourceAsStream,"utf-8"));

        Class<?> cls = Class.forName(properties.getProperty("cls"));

        String f1 = properties.getProperty("f1");
        String f2 = properties.getProperty("f2");
        String f3 = properties.getProperty("f3");

        Object o = cls.newInstance();
/*
        Field name = cls.getDeclaredField("name");
        Field sex = cls.getDeclaredField("sex");
        Field age = cls.getDeclaredField("age");

        name.setAccessible(true);
        age.setAccessible(true);
        sex.setAccessible(true);


        name.set(o,f1.split(":")[1]);
        sex.set(o,f2.split(":")[1]);
        age.set(o,Integer.valueOf(f3.split(":")[1]));
*/
        Method[] declaredMethods = cls.getDeclaredMethods();

        cls.getDeclaredMethod("setName",String.class).invoke(o,f1.split(":")[1]);
        cls.getDeclaredMethod("setSex",String.class).invoke(o,f2.split(":")[1]);
        cls.getDeclaredMethod("setAge",int.class).invoke(o,Integer.valueOf(f3.split(":")[1]));

        String introduce = (String) cls.getDeclaredMethod("toString").invoke(o);
        System.out.println(introduce);
    }
}
