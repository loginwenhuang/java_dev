package com.wen.controller;

import com.wen.service.IStaffService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @author :muxiaowen
 * @date : 2022/8/25 9:08
 */
@Controller
public class StaffController {
    @Resource
    private IStaffService staffService;

    @RequestMapping("/list")
    @ResponseBody
    public String list(){
        return staffService.staffList().toString();
    }
}
