package com.wen.test1;

import javafx.beans.property.Property;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 9:57
 */
public class Test {
    public static void main(String[] args) throws IOException {
        InputStream is = Test.class.getClassLoader().getResourceAsStream("stu.properties");
        Properties properties = new Properties();
        properties.load(is);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("sex"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("tall"));
    }
}
