package com.mu.testA;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 14:06
 */
public class Test {
    public static void main(String[] args) {
        JavaCourse java =new JavaCourse();
        HtmlCourse html = new HtmlCourse();
        CsharpCourse csharp =new CsharpCourse();

        Student s = new Student("王五");
        s.study(java);
        s.study(html);
        s.study(csharp);
    }
}
