package com.wen.task3;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 19:58
 */
public class Node {
    private String name;
    public Node next;

    public Node(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
