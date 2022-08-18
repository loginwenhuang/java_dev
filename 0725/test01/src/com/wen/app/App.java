package com.wen.app;

import com.wen.dao.IStudentDao;
import com.wen.service.IStudentService;
import com.wen.service.impl.StudentServiceImpl;

import javax.net.ssl.SSLContext;
import java.text.ParseException;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 16:36
 */
public class App {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        IStudentService iStudentService = new StudentServiceImpl();
        while (true){
            System.out.println("请选择:1.增 2.删 3.改 4.查 5.退出");
            switch (scanner.nextInt()){
                case 1:
                    if(iStudentService.insertStu()){
                        System.out.println("添加成功!");
                    }
                    break;
                case 2:
                    if(iStudentService.deleteStu()){
                        System.out.println("删除成功!");
                    }
                    break;
                case 3:
                    if(iStudentService.updateStu()){
                        System.out.println("修改成功!");
                    }
                    break;
                case 4:
                    iStudentService.selectStu();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}
