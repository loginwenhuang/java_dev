package com.mu.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 9:02
 */
public class Master {
    String name;

    public Master(String name) {
        this.name = name;
    }
/**
    public void feed(Dog dog){
        System.out.println("主人"+this.name+"喂东西");
        dog.eat();
    }
    public void feed(Cat cat){
        System.out.println("主人"+this.name+"喂东西");
        cat.eat();
    }
*/
    public void feed(Pet pet){
        System.out.println("主人"+this.name+"带"+pet.name+"咪西");
        pet.eat();
        if (pet instanceof Cat) {
            //向下转型
            Cat cat = (Cat) pet;
            cat.catchMouse();
        }else  if(pet instanceof Dog){
            Dog dog = (Dog) pet;
            dog.seeDoor();
        }
        System.out.println("===================");
    }
}
