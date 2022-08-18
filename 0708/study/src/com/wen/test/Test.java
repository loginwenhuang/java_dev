package com.wen.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 10:09
 */
public class Test {
    public static void main(String[] args) throws IOException {
        //用当前类的类加载器加载属性文件，返回输入流
        InputStream is =  Test.class.getClassLoader().getResourceAsStream("stu.properties");
        System.out.println(is);
        //创建Properties对象(可以存储键值对数据)，处理properties文件
        Properties properties = new Properties();
        //加载数据流
        properties.load(is);
        //输出学生信息
        //properties.getProperty(键):根据键获取值
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("sex"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("tall"));
        is.close();

    }
}
