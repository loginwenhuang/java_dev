package com.mu.test3;

/**
 * @author :muxiaowen
 * @date : 2022/7/5 17:30
 */
public class Test1 {
    public static void main(String[] args){
        Student s = new Student();
        s.setName("王五");
        try {
            s.setAge(-18);
        }catch (AgeException ex){
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("出错了:"+e.getMessage());
        }finally {
            System.out.println(s);
        }

    }
}
