package com.wen.app;

import com.wen.service.IAdminService;
import com.wen.service.IBookService;
import com.wen.service.IUserService;
import com.wen.service.impl.AdminService;
import com.wen.service.impl.BookService;
import com.wen.service.impl.UserServiceImpl;

import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/23 16:13
 */
public class App {
    public static void main(String[] args) {
        System.out.println("===========");
        System.out.println("=图书管理系统=");
        System.out.println("===========");
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请选择:1.管理员登录 2.用户登录 3.用户注册 4.退出");
            IUserService iUserService = new UserServiceImpl();
            IAdminService iAdminService = new AdminService();
            IBookService iBookService = new BookService();
            switch (scanner.nextInt()){
                case 1:
                    System.out.println("管理员你好,请登录!");
                    if(iAdminService.login()){
                        System.out.println("功能选择:1.书籍管理 2.用户管理 3.退出");
                        switch(scanner.nextInt()){
                            case 1:

                                break;
                            case 2:
                                iAdminService.userManagement();
                                break;
                            case 3:
                                System.out.println("成功退出!");
                                break;
                            default:
                                System.out.println("输入错误!");
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("用户你好，请登录");
                    if(iUserService.login()){

                    }
                    break;
                case 3:
                    System.out.println("欢迎注册!");
                    if(iUserService.register()){
                        System.out.println("注册成功!");
                    }
                    break;
                case 4:
                    System.out.println("感谢使用!");
                    return;
                default:
                    System.out.println("输入错误!");
                    break;
            }
        }
    }
}
