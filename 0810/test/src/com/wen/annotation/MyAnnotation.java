package com.wen.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


import static java.lang.annotation.ElementType.TYPE;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 19:35
 */
@Target(TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    int num() default 20;
    String value();
    String value1();
    String[] values() default {"a","b"};
}
