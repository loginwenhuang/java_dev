package com.wen.test;

import com.wen.entity.Student;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 16:46
 */
public class Test1 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Student student = new Student();
        Class aClass = Class.forName("com.wen.entity.Student");
        Method setName = aClass.getDeclaredMethod("setName", String.class);

        Class[] parameterTypes = setName.getParameterTypes();
        for (Class c:parameterTypes) {
            System.out.println(c);
        }
        System.out.println(setName.getName()+"  "+setName.getReturnType());
        //调用方法
        setName.invoke(student,"张三");
        System.out.println(student);
    }
}
