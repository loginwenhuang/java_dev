package com.yzh.test05;
/**
 * @author wen
 */
public class Test05a {
    public static void main(String[] args) {
        Student.x=500;

        Student s1 = new Student("张三",20);
        Student s2 = new Student("李四",18);
        s1.introduce();
        s2.introduce();

        System.out.println("========================");
        //修改s1的姓名为张三丰
        s1.name="张三丰";
        /* s1.x = 200; */
        s1.introduce();
        s2.introduce();

    }
}
