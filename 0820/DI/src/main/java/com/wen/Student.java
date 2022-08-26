package com.wen;

import lombok.Data;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/21 21:01
 */
@Data
public class Student {
    private String name;
    private String sex;
    private Integer age;
    private Double tall;

    private List<String> hobbies;

    public Student() {
    }
    public Student(String name, String sex, Integer age, Double tall, List<String> hobbies) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.tall = tall;
        this.hobbies = hobbies;
    }
}
