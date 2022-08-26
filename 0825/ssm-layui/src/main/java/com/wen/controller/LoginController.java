package com.wen.controller;

import com.wen.entity.CommonResult;
import com.wen.entity.User;
import com.wen.service.ILoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 17:55
 */
@RestController
@RequestMapping("/log")
public class LoginController {

    @Resource
    private ILoginService loginService;

    @RequestMapping("/in")
    public CommonResult login(User user){
        System.out.println(user);
        int count = loginService.userLogin(user);
        if(count==1){
            return CommonResult.success();
        }
        return CommonResult.fail();
    }
}
