package com.mu.task1;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 17:36
 */
public class Police extends Person{
    public Police(String name, String sort) {
        super(name, sort);
    }

    @Override
    public void fight(Person person,Gun gun) {
        super.fight(person,gun);
        System.out.println(person.name+"受到了"+name+"的攻击，开始反击!");
        this.setIgun(gun);
    }
}
