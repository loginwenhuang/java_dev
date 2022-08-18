package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author :muxiaowen
 * @date : 2022/8/13 16:41
 */
@Data
@AllArgsConstructor
public class CommonResult {
    private Integer code;
    private String msg;
    private Integer count;
    private Object data;

    public static CommonResult success(){
        return new CommonResult(0,"成功",null,null);
    }
    public static CommonResult success(PageInfo pageInfo){
        return new CommonResult(0,"成功",pageInfo.getTotalCount(),pageInfo.getData());
    }
    public static CommonResult success(Integer count,Object obj){
        return new CommonResult(0,"成功",count,obj);
    }
    public static CommonResult fail(){
        return new CommonResult(0,"失败",null,null);
    }
}
