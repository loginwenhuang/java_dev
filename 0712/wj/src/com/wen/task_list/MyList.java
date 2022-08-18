package com.wen.task_list;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 19:42
 */
public interface MyList<E> {
    void add(E element);
    E get(int index);
    int size();
    E remove(int index);
}
