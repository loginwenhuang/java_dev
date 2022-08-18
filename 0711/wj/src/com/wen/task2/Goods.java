package com.wen.task2;

import java.util.Objects;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 17:02
 */
public class Goods implements Comparable{
    private String type;
    private String name;

    public Goods(){

    }

    public Goods(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goods goods = (Goods) o;
        return Objects.equals(type, goods.type) && Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type,name);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
