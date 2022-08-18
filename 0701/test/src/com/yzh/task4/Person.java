package com.yzh.task4;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:28
 */
public class Person {
    private String name;
    private int age;
    private boolean gender;
    private Person person;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setPerson(Person person) {
        if(person.getPerson()==this){
            this.person = person;
            System.out.println(this.name+person.getName()+"结婚了!");
        }
        else if(this.gender^person.gender){
            this.person = person;
            System.out.println(person.getName());
            System.out.println(this.name);
            person.setPerson(this);
            System.out.println(this.name+person.getName()+"结婚了!");
        }
    }

    public boolean isMarry(Person person){
        return (this.gender^person.gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Person getPerson() {
        if (person!=null){
            return person;
        }else {
            System.out.print("没有配偶的");
            return this;
        }
    }

    public boolean gender() {
        System.out.println(this.getName()+(this.gender?"男":"女"));
        return this.gender;
    }
}
