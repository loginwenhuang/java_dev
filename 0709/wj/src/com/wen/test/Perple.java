package com.wen.test;

import java.util.Objects;

/**
 * @author :muxiaowen
 * @date : 2022/7/9 9:00
 */
public class Perple {
    String name;
    String sex;

    public Perple(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Perple perple = (Perple) o;
        return Objects.equals(name, perple.name) && Objects.equals(sex, perple.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sex);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Perple[" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ']';
    }
}
