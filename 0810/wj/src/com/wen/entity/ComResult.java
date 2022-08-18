package com.wen.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/10 9:21
 */
public class ComResult {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public ComResult() {
    }

    public ComResult(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }
    public static ComResult success(Integer count,Object data){
        return new ComResult(0,"成功",count,data);
    }
    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
