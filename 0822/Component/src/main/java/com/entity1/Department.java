package com.entity1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 15:37
 */
@Component("de")
public class Department {
    @Value("开发")
    private String name;

    @Override
    public String toString() {
        return "Department{" +
                "name='" + name + '\'' +
                '}';
    }
}
