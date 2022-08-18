package com.wen.tes1;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 10:23
 */
public class Car {
    String brand;
    int price;

    public Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
