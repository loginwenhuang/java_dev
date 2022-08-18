package com.yzh.test01;

/**
 * @author wen
 */
public class Car {
    String brand;
    int prince;
    int speed;

    public Car(String brand, int prince, int speed) {
        this.brand = brand;
        this.prince = prince;
        this.speed = speed;
    }

    public float addOil(int liter,float pay){
        return liter*pay;
    }
    public void run(int speed){
        if(speed<100){
            System.out.println("安全驾驶");
        }else{
            System.out.println("危险驾驶");
        }
    }
}
