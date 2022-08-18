package com.wen.test3_fx_tp;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 15:22
 */
public class Test {
    public static void main(String[] args) {

        Info<Integer>  i1 = new Info<>();
        i1.setVar(100);
        fun(i1);

        Info<Double> i2 = new Info<>();
        i2.setVar(12.13);
        fun(i2);


    }

    public static void fun(Info<? extends Number> info){
        System.out.println(info);

    }
//    public static void fun(Info<?> info){
//        System.out.println(info);
//        //使用通配符 ? 可以接受任意泛型参数，但是此时是泛型对象不能修改数据
//        //info.setVar("mu");
//    }
}
