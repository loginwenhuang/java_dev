package com.yzh.task;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "小成";
        dog.varieties = "拉的不多";
        dog.age = 28;
        dog.display();
        dog.eat("巧克力");
        Scanner scanner = new Scanner(System.in);
        System.out.println(dog.guard(scanner.next()));
    }
}
