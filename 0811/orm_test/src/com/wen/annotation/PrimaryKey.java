package com.wen.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 14:41
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface PrimaryKey {
    boolean isAutoIncrement();
}
