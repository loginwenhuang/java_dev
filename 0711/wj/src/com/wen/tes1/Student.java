package com.wen.tes1;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 10:15
 */
public class Student implements Comparable{
    private String name;
    int age;
    public Student(){

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Student)){
            return 1;
        }

        Student s = (Student) o;

        if(this.age>s.age){
            return 1;
        }else if(this.age<s.age){
            return -1;
        }else {
            return this.name.compareTo(s.name);
        }
    }
}
