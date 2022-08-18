package com.wen.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 8:09
 */
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface TeacherAnnotation {
    int age() default 24;
    String value();
}
