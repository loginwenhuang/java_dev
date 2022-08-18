package com.wen.test;

import com.wen.annotation.MyAnnotation;
import com.wen.entity.Student;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 20:36
 */
public class Test8 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class<Student> studentClass = Student.class;
        Student student = studentClass.newInstance();
        Annotation[] annotations = studentClass.getAnnotations();
        for (Annotation a:annotations) {
            if(a instanceof MyAnnotation){
                MyAnnotation myAnnotation = (MyAnnotation) a;
                studentClass.getDeclaredMethod("setName",String.class).invoke(student,myAnnotation.value());
                studentClass.getDeclaredMethod("setSex", String.class).invoke(student,myAnnotation.value1());
                studentClass.getDeclaredMethod("setAge", int.class).invoke(student,myAnnotation.num());

                System.out.println(student);
            }
        }
    }
}
