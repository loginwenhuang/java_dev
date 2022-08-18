package com.wen.test;

import com.wen.annotation.MyAnnotation;
import com.wen.entity.Student;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 19:40
 */
public class Test5 {
    public static void main(String[] args) {
        //判断目标类是否有对应的注解
        //要使得运行时对应注解依然有效，则需要在注解上设置元注解：@Retention(RetentionPolicy.RUNTIME)
        boolean b = Student.class.isAnnotationPresent(MyAnnotation.class);
        System.out.println(b);
    }
}
