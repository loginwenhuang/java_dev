package com.yzh.test00;

/**
 * @author wen
 */
public class Test {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.name = "张三";
        stu1.age = 20;
        stu1.phone = 18278945612L;
        stu1.hobby = "足球";

        Student stu2 = new Student();
        stu2.name = "李四";
        stu2.age = 18;
        stu2.phone = 18377788899L;
        stu2.hobby = "篮球";

        stu1.intro();
        stu2.intro();
        stu1.internet(2,5);
        stu2.internet(4,5);
    }
}
