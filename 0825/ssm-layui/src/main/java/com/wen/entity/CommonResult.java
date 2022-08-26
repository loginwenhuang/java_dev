package com.wen.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :muxiaowen
 * @date : 2022/8/24 14:08
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonResult {
    private Integer code;
    private String msg;
    private Object data;
    private Integer count;

    public static CommonResult success(){
        return new CommonResult(0,"成功",null,null);
    }

    public static CommonResult success(Object data,Integer total){
        return new CommonResult(0,"成功",data,total);
    }
    public static CommonResult fail(){
        return new CommonResult(1,"失败",null,null);
    }
}
