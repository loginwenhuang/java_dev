package com.wen.service.impl;

import com.mysql.cj.util.StringUtils;
import com.wen.dao.IAdminDAO;
import com.wen.dao.impl.AdminDAO;
import com.wen.entity.Admin;
import com.wen.entity.User;
import com.wen.service.IAdminService;
import com.wen.service.IUserService;
import com.wen.util.PackUser;

import java.util.Map;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 17:48
 */
public class AdminService implements IAdminService {
    Scanner scanner = new Scanner(System.in);
    IAdminDAO adminDAO = new AdminDAO();
    IUserService iUserService = new UserServiceImpl();
    @Override
    public boolean login() {
        while (true){
            System.out.println("请输入管理员账号:");
            String account = scanner.next();
            System.out.println("请输入管理员密码:");
            String password = scanner.next();
            if(StringUtils.isNullOrEmpty(account.trim())){
                System.out.println("账号不能为空!");
            }else if(StringUtils.isNullOrEmpty(password.trim())){
                System.out.println("密码不能为空!");
            }else {
                Admin admin = adminDAO.verifyAccountAndPassword(account,password);
                if(admin==null){
                    System.out.println("账号或密码错误");
                    return false;
                }
                System.out.println("登录成功!");
                return true;
            }
        }
    }

    @Override
    public void userManagement() {
        while (true){
            System.out.println("=========用户信息==========");
            iUserService.showAllUser();
            System.out.println("功能选择:1.修改用户 2.删除用户 3.退出");
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("请输入用户id");
                    String user_id = scanner.next();
                    if(iUserService.modifyUser(user_id)){
                        System.out.println("修改成功");
                    }else {
                        System.out.println("修改失败");
                    }
                    break;
                case 2:
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }

    @Override
    public boolean bookManagement() {
        return false;
    }



}
