package com.wen.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 8:14
 */
public class Test9 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Properties properties = new Properties();
        InputStream resourceAsStream = Test9.class.getClassLoader().getResourceAsStream("stu.properties");
        properties.load(new InputStreamReader(resourceAsStream,"utf-8"));
        String t1 = properties.getProperty("t1");
        String t2 = properties.getProperty("t2");

        Class<?> cls2 = Class.forName(properties.getProperty("cls2"));
        Object o = cls2.newInstance();

        Object o1 = cls2.getConstructor().newInstance();

        Field name = cls2.getDeclaredField("name");
        Field age = cls2.getDeclaredField("age");
        name.setAccessible(true);
        age.setAccessible(true);

        name.set(o,t1.split(":")[1]);
        age.set(o,Integer.valueOf(t2.split(":")[1]));

        System.out.println(o);

        cls2.getDeclaredMethod("setName",String.class).invoke(o1,t1.split(":")[1]);
        cls2.getDeclaredMethod("setAge",int.class).invoke(o1,Integer.valueOf(t2.split(":")[1]));

        System.out.println(o1);
    }
}
