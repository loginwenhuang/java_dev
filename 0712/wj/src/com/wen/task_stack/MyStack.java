package com.wen.task_stack;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 17:42
 */
public class MyStack<E>{

    /**
     * 存储元素的物理结构
     */
    private Object[] arr;

    /**
     * 数组的默认长度
     */
    private int stackLength = 4 ;

    /**
     * 记录栈容器的元素个数
     */
    private int size = 0;

    /**
     * 操作数组下标位置的指针
     */
    private int index = -1;

    /**
     * 向栈容器中添加元素
     * @param
     * @return
     */
    public E push(E item){
        //初始化数组
        this.capacity();
        //添加元素
        this.arr[++index] = item;
        //记录数据个数
        size++;
        return item;
    }
    /**
     * 数组初始化+以1.5倍对数组扩容
     */
    private void capacity(){
        //数组初始化
        if(this.arr == null){
            this.arr = new Object[this.stackLength];
        }
        //1.5倍扩容
        if(this.size - (this.stackLength) >= 0){
            this.stackLength = this.stackLength +(this.stackLength >> 1);
            this.arr = Arrays.copyOf(this.arr,this.stackLength);
        }
    }

    public E pop(){
        //如果栈容器中没有元素，抛出异常
        if(this.index == -1){
            throw new EmptyStackException();
        }
        //记录数据个数
        this.size--;

        return (E)this.arr[index--];
    }
    public boolean isEmpty(){
        return this.size == 0;
    }

}
