package com.wen.test;

import com.wen.annotation.MyAnnotation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 19:50
 */
public class Test6 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        Class<?> stuClass = Class.forName("com.wen.entity.Student");
        if(stuClass.isAnnotationPresent(MyAnnotation.class)){
            MyAnnotation annotation = stuClass.getAnnotation(MyAnnotation.class);
            System.out.println(annotation.num());
            System.out.println(annotation.value());
            System.out.println(annotation.value1());

            Object o = stuClass.newInstance();
            Field name = stuClass.getDeclaredField("name");
            Field sex = stuClass.getDeclaredField("sex");
            Field age = stuClass.getDeclaredField("age");
            name.setAccessible(true);
            sex.setAccessible(true);
            age.setAccessible(true);

            name.set(o,annotation.value());
            sex.set(o,annotation.value1());
            age.set(o,annotation.num());

            String introduce = (String)stuClass.getDeclaredMethod("toString").invoke(o);
            System.out.println(introduce);
        }
    }
}
