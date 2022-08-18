package com.wen.service.impl;

import com.mysql.cj.util.StringUtils;
import com.wen.dao.IUserDAO;
import com.wen.dao.impl.UserDAO;
import com.wen.entity.User;
import com.wen.service.IUserService;
import com.wen.util.PackUser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 16:33
 */
public class UserServiceImpl implements IUserService {
    List<Map<String,Object>> users = null;
    Scanner scanner = new Scanner(System.in);
    IUserDAO userDAO = new UserDAO();
    User user =null;
    private String[] sts = null;
    List<String> list = null;
    Object[] params = null;
    public User getUser() {
        return user;
    }

    @Override
    public boolean login() {
        while(true){
            System.out.println("请输入用户名");
            String user_name = scanner.next();
            System.out.println("请输入密码");
            String user_password = scanner.next();

            if(StringUtils.isNullOrEmpty(user_name)){
                System.out.println("账号不能为空!");
            }else if(StringUtils.isNullOrEmpty(user_password)){
                System.out.println("密码不能为空");
            }else {
                user = userDAO.getByUserNameAndPassword(user_name,user_password);
                if(user==null){
                    System.out.println("账号或密码错误!");
                    return false;
                }
                System.out.println("登录成功!");
                return true;
            }
        }
    }

    @Override
    public boolean register() {
        sts = new String[]{"用户名:", "密码:", "昵称:", "性别:", "手机号:"};
        list = new ArrayList<>();
        for (int i = 0; i < sts.length; i++) {
            System.out.println("请输入你的"+sts[i]);
            list.add(scanner.next());
        }
        if(userDAO.getByUserName(list.get(0))){
            System.out.println("用户名不可用(已存在)");
            return false;
        }
        if(userDAO.getByPhone(list.get(4))){
            System.out.println("手机号已存在");
            return false;
        }
        User user = new User(list.get(0),list.get(1),list.get(2),list.get(3),list.get(4));
        if(userDAO.insert(user)>0){
            return true;
        }
        System.out.println("未知原因注册失败");
        return false;
    }

    @Override
    public boolean deleteUser(String user_id) {

        return false;
    }

    @Override
    public boolean modifyUser(String user_id) {
        if(StringUtils.isNullOrEmpty(user_id.trim())){
            System.out.println("id不能为空!");
            return false;
        }
        sts = new String[]{"用户名:", "密码:", "昵称:", "手机号:"};
        System.out.println("请输入用户信息");
        params = new Object[5];
        for (int i = 0; i < sts.length; i++) {
            System.out.println("请输入你的"+sts[i]);
            params[i] = scanner.next();
        }
        params[4] = user_id;
        if(userDAO.updateUser(params)){
            return true;
        }
        return false;
    }

    @Override
    public void showAllUser() {
        users = userDAO.getAllUser();
        if(users!=null){
            for (Map map:users) {
                System.out.println(PackUser.packUser(map));
            }
        }
    }
}
