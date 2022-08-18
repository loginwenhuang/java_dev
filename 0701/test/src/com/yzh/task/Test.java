package com.yzh.task;

/**
 * @author :muxiaowen
 * @date : 2022/7/1 16:33
 */
public class Test {
    public static void main(String[] args) {
        Print print = new Print();
        Student student = new Student("张三",18);
        Teacher teacher = new Teacher("李四",29);
        print.print(student);
        print.print(teacher);
    }
}
