package com.wen.test;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author :muxiaowen
 * @date : 2022/7/8 15:23
 */
public class Test2 {
    public static void main(String[] args) {
        //定义Collection接口变量，指向集合实现类对象ArrayList
        Collection col = new ArrayList();
        // add向Collection集合末尾添加元素
        // 默认可以存储任何类型的数据
        // Collection允许数据重复，并且可以存null值
        // Collection 没有办法根据索引获取单个元素
        col.add("aaa");
        col.add("aaa");
        col.add(123);
        col.add(12.13);
        col.add(true);

        System.out.println(col);
        //foreach 遍历集合
        for (Object o : col) {
            System.out.println(o);
        }
        //判断元素是否存在
        col.contains(123);
        //删除元素
        col.remove(123);
        System.out.println(col);

        //删除集合中的所有元素
        Collection col2 = new ArrayList();
        col2.add("aaa");
        col2.add(12.13);

        col.removeAll(col2);
        System.out.println(col);
        //删除集合中的所有元素
        col.clear();
        System.out.println(col);
    }
}
