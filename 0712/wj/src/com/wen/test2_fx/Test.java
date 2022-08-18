package com.wen.test2_fx;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 11:19
 */
public class Test {
    public static void main(String[] args) {
        Position<Integer> position = new Position(10,15);

        System.out.println(position);

        Position<String> position1 = new Position("aaa","bbb");
        System.out.println(position1);

        position =new Position(12.5,"bbb");
        System.out.println(position);

    }
}
