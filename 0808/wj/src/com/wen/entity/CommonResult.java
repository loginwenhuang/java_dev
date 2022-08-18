package com.wen.entity;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 17:40
 */
public class CommonResult {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public CommonResult() {
    }

    public CommonResult(Integer code, String msg, Integer count, Object data) {
        this.code = code;
        this.msg = msg;
        this.count = count;
        this.data = data;
    }

    public static CommonResult success(){
        return new CommonResult(0,"成功",null,null);
    }
    public static CommonResult success(Integer count,Object data){
        return new CommonResult(0,"成功",count,data);
    }
    public static CommonResult fail(){
        return new CommonResult(1,"失败",null,null);
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

    @Override
    public String toString() {
        return "CommonResult{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", count=" + count +
                ", data=" + data +
                '}';
    }
}
