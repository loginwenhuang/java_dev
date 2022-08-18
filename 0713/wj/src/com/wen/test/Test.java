package com.wen.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/13 9:08
 */
public class Test {
    public static void main(String[] args) {
        MySinglyLinkedList<String> mySinglyLinkedList = new MySinglyLinkedList<>();
        mySinglyLinkedList.add("a");
        mySinglyLinkedList.add("b");
        mySinglyLinkedList.add("c");
        System.out.println(mySinglyLinkedList.get(2));
        mySinglyLinkedList.remove(1);
        System.out.println(mySinglyLinkedList.get(1));
    }
}
