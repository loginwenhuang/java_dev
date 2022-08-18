package com.wen.test;

import com.wen.annotation.TeacherAnnotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 8:48
 */
public class Test10 {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.wen.entity.Teacher");
        Object o = aClass.newInstance();
        Annotation[] annotations = aClass.getAnnotations();
        for (Annotation annotation:annotations) {
            if(annotation instanceof TeacherAnnotation){
                TeacherAnnotation teacherAnnotation = (TeacherAnnotation) annotation;

                Field name = aClass.getDeclaredField("name");
                Field age = aClass.getDeclaredField("age");
                name.setAccessible(true);
                age.setAccessible(true);
                name.set(o,teacherAnnotation.value());
                age.set(o,teacherAnnotation.age());

                System.out.println(o);
            }
        }
    }
}
