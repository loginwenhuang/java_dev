package com.wen.test;

import com.wen.annotation.StuAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 9:00
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.wen.entity.Student");
        Object o = aClass.newInstance();

        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation a:annotations) {
            if(a instanceof StuAnnotation){
                StuAnnotation stuAnnotation = (StuAnnotation) a;
                aClass.getDeclaredMethod("setId",int.class).invoke(o,stuAnnotation.id());
                aClass.getDeclaredMethod("setName", String.class).invoke(o,stuAnnotation.name());
                aClass.getDeclaredMethod("setSex", String.class).invoke(o,stuAnnotation.sex());
                aClass.getDeclaredMethod("setAge", int.class).invoke(o,stuAnnotation.age());

                aClass.getDeclaredMethod("introduce").invoke(o);
            }
        }
    }
}
