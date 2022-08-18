package com.wen.test;

import java.util.Objects;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 8:59
 */
public class Goods {
    private String name;
    double price;

    public Goods(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Goods goods = (Goods) o;
        return Double.compare(goods.price, price) == 0 && Objects.equals(name, goods.name);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() +Double.hashCode(this.price);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
