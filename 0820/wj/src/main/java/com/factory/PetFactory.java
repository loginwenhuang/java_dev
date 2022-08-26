package com.factory;

import com.entity.Cat;
import com.entity.Dog;
import com.entity.Pet;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 9:02
 */
public class PetFactory {
    public static Pet createPet(String type,String name,String color){
        Pet pet = null;
        switch (type){
            case "dog":
                pet = new Dog(name,color);
                break;
            case "cat":
                pet = new Cat(name, color);
                break;
            default:
                break;
        }
        return pet;
    }
}
