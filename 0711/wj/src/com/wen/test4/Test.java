package com.wen.test4;

import java.util.ArrayList;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/7/11 16:02
 */
public class Test {
    public static void main(String[] args) {
        List<People> list= new ArrayList<People>();
        //添加非People类型的数据直接报错
        //list.add("aaa");
        list.add(new People("张三",18));
        list.add(new People("李四",19));
        //遍历
        for (int i = 0; i < list.size(); i++) {
            People p = list.get(i);
            p.introduce();
        }

        for (People p:list) {
            p.introduce();
        }

    }
}
