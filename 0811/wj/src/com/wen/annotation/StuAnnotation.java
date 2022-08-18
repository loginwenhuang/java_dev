package com.wen.annotation;

import javax.xml.bind.Element;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 9:05
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface StuAnnotation {
    int id() default 1;
    String name();
    String sex();
    int age() default 20;

    String value() default "value";
    int[] nums() default {1,2,3,4,5,6};
}
