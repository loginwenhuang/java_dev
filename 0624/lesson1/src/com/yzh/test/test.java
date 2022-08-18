package com.yzh.test;

public class test {
    public static void main(String[] args){
        String name = "目小温";
        char sex = '男';
        int age = 40;
        double tall = 1.75;
        boolean hasFriend = true;
        while(hasFriend){
            System.out.println("姓名:"+name);
            System.out.println("性别:"+sex);
            System.out.println("年龄:"+age++);
            System.out.println("身高:"+tall);
            System.out.println("有没有朋友:"+hasFriend);
            if(age>45){
                hasFriend = false;
            }
        }

    }
}
