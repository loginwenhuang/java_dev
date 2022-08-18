package com.mu.test3;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 17:27
 */
public class Student {
    private String name;
    private int age;
    public String getName(){
        return name;
    }
    public void  setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }

    public void setAge(int age) throws Exception {
        if(age<0||age>100){
            //throw new Exception("年龄不是有效值");
            throw new AgeException("年龄错误");
        }else {
            this.age = age;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
