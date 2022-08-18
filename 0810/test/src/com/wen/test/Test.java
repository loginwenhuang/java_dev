package com.wen.test;

import com.wen.entity.Student;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 10:34
 */
@SuppressWarnings("all")
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, NoSuchFieldException {
        System.out.println("=====通过类型属性获取类的类型=====");
        Class clz1 = Student.class;
        System.out.println(clz1);
        System.out.println("=====通过反射器加载类获取类的类型=====");
        Class clz2 = Class.forName("com.wen.entity.Student");
        System.out.println(clz2);
        System.out.println("=====通过实例对象的getClass获取类的类型=====");
        Class clz3 = new Student().getClass();
        System.out.println(clz3);
        System.out.println("=====类名=====");
        Class clz = Class.forName("com.wen.entity.Student");
        System.out.println(clz.getName());
        System.out.println(clz.getSimpleName());
        System.out.println("=====创建新的对象=====");
        Object o = clz.newInstance();
        System.out.println(o);

        Class claz = clz.forName("com.wen.entity.Student");
        System.out.println(claz);

        System.out.println("======类中的public方法=======");
        Method[] methods = clz.getMethods();
        for (Method m: methods) {
            System.out.println(m);
        }
        System.out.println("====student中的name属性(字段)====");
        Field field = clz.getDeclaredField("name");
        System.out.println(field);

        System.out.println("=====类中的所有方法=====");
        Method[] declaredMethods = clz.getDeclaredMethods();
        for (Method m:declaredMethods) {
            System.out.println(m);
        }

        System.out.println("======类中的构造器=======");
        Constructor[] constructors = clz.getConstructors();
        for (Constructor c: constructors) {
            System.out.println(c);
        }
        System.out.println("=====类的所有可访问字段======");
        Field[] declaredFields = clz.getDeclaredFields();
        for (Field f:declaredFields) {
            System.out.println(f);
        }

        System.out.println("===类中的eat方法===");
        Method eat = clz.getDeclaredMethod("eat", String.class);
        System.out.println(eat);

    }
}
