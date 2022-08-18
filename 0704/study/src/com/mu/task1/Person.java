package com.mu.task1;

/**
 * @author :muxiaowen
 * @date : 2022/7/4 17:28
 */
public abstract class Person {
    protected String name;
    protected String sort;
    protected Igun igun;

    public Person(String name, String sort) {
        this.name = name;
        this.sort = sort;
    }

    public void fight(Person person,Gun gun) {
        System.out.print(this.name+"使用发起了攻击!");
    }
    public void setIgun(Igun igun){
        this.igun = igun;
        igun.used(this.name);
    }
}
