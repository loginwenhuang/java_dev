package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/2 9:03
 */
public class Car {
    protected String name;
    protected String color;
    public Car(){

    }
    public Car(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void run(){
        System.out.print(this.color+this.name);
    }
    public void drive(Bus bus){
        bus.run();
    }
    public void drive(Taxi taxi){
        taxi.run();
    }
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
