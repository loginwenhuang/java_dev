package com.entity;

import com.entity1.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 14:38
 */
@Component("xx")
@Scope(value = "prototype")
@Lazy(value = false)
public class Driver {
    @Value("张三")
    private String name;

    @Autowired
    private Car car;

    @Autowired
    @Qualifier(value = "dog")
    public Pet pet;

    @Autowired(required = false)
    public Hobby hobby;

    @Resource(type = Department.class)
    public Department q;

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", car=" + car +
                ", pet=" + pet +
                ", hobby=" + hobby +
                ", department=" + q +
                '}';
    }
}
