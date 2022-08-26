package com.factory;

import com.entity.Pet;

/**
 * @author :muxiaowen
 * @date : 2022/8/20 15:38
 */
public class PetFactory {
    public static Pet createInstance(String type,String name,String color) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Pet pet = null;
        Class<?> aClass = Class.forName("com.entity."+type);
        pet =(Pet)aClass.newInstance();
        pet.setName(name);
        pet.setColor(color);
        return pet;
    }
}
