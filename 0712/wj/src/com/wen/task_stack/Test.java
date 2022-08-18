package com.wen.task_stack;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 17:59
 */
public class Test {
    public static void main(String[] args) {
        MyStack<String> myStack = new MyStack<>();
        System.out.println(myStack.isEmpty());
        myStack.push("a");
        myStack.push("a");
        myStack.push("a");
        myStack.push("a");
        myStack.push("a");
        myStack.push("a");
        myStack.push("a");
        myStack.push("a");
        myStack.push("a");
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());
        System.out.println(myStack.pop());

    }
}
