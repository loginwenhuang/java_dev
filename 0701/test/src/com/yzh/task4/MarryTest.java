package com.yzh.task4;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 17:40
 */
public class MarryTest {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        person1.setName("小王");
        person1.setAge(20);
        person1.setGender(true);

        person2.setName("小张");
        person2.setAge(18);
        person2.setGender(false);

        person3.setName("小李");
        person3.setAge(22);
        person3.setGender(true);

        person1.gender();
        person2.gender();

        if(person1.isMarry(person2)){
            System.out.println("可以结婚!");
        };

        person1.setPerson(person2);
        System.out.println(person1.getName()+"的配偶:"+person1.getPerson().getName());
        System.out.println(person2.getName()+"的配偶:"+person2.getPerson().getName());
        System.out.println(person3.getName());
        if(person1.isMarry(person3)){
            System.out.println("可以结婚!");
        }else{
            System.out.println((person1.gender()?"男男":"女女")+"不可以结婚!");
        }
    }
}
