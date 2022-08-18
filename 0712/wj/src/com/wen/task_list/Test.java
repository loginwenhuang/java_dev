package com.wen.task_list;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 20:28
 */
public class Test {
    public static void main(String[] args) {
        MySinglyLinkedList<String> mySinglyLinkedList = new MySinglyLinkedList<>();
        mySinglyLinkedList.add("a");
        mySinglyLinkedList.add("b");
        mySinglyLinkedList.add("c");
        System.out.println(mySinglyLinkedList.size());
        System.out.println(mySinglyLinkedList.remove(0));
        for (int i = 0; i < mySinglyLinkedList.size(); i++) {
            System.out.println(mySinglyLinkedList.get(i));
        }

        MyList<String> myList = new MySinglyLinkedList<>();

    }
}
