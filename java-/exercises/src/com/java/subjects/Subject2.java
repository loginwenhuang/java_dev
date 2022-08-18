package com.java.subjects;

/**
 * @author :muxiaowen
 * @date : 2022/6/30 20:03
 */
public class Subject2 {
    public static void main(String[] args) {
        Box box = new Box("A",6);
        Box box1 = new Box("B",8);
        System.out.println("交换前"+box.name+"盒子的数为："+box.num+"\t"+box1.name+"盒子的数为："+box1.num);
        int num = box.num;
        box.num = box1.num;
        box1.num = num;
        System.out.println("交换后"+box.name+"盒子的数为："+box.num+"\t"+box1.name+"盒子的数为："+box1.num);
    }
    public static class Box{
        String name;
        int num;
        public Box(String name,int num){
            this.name =name;
            this.num = num;
        }
    }
}
