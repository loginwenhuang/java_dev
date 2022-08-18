package com.wen.test3_fx_tp;

/**
 * @author :muxiaowen
 * @date : 2022/7/12 15:22
 */
public class Info<T> {
    private T var;

    public T getVar(){
        return var;
    }

    public void setVar(T var){
        this.var = var;
    }

    @Override
    public String toString() {
        return "Info{" +
                "var=" + var +
                '}';
    }
}
