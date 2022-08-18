package com.wen.test;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.Properties;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 17:21
 */
@SuppressWarnings("all")
public class Test3 {
    public static void main(String[] args) throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Properties properties = new Properties();
        InputStream resourceAsStream = Test3.class.getClassLoader().getResourceAsStream("stu.properties");
        //将字节流转为字符流并设置编码格式，与properties配置文件的编码格式一致
        properties.load(new InputStreamReader(resourceAsStream,"utf-8"));
        //获取文件中的配置
        String cls = properties.getProperty("cls");
        String f1 = properties.getProperty("f1");
        String f2 = properties.getProperty("f2");
        String f3 = properties.getProperty("f3");

        //加载类
        Class c = Class.forName(cls);
        Object o = c.newInstance();
        //获取特定字段类型
        Field name = c.getDeclaredField("name");
        Field sex = c.getDeclaredField("sex");
        Field age = c.getDeclaredField("age");
        name.setAccessible(true);
        sex.setAccessible(true);
        age.setAccessible(true);
        //设置数据
        name.set(o,f1.split(":")[1]);
        sex.set(o,f2.split(":")[1]);
        age.set(o,Integer.valueOf(f3.split(":")[1]));
        System.out.println(o);

    }
}
