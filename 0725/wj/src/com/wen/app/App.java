package com.wen.app;

import com.wen.dao.IStudentDao;
import com.wen.service.IStudentService;
import com.wen.service.impl.IStudentServiceImpl;

import java.text.ParseException;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 9:00
 */
public class App {
    public static void main(String[] args) throws ParseException {
        IStudentService iStudentService = new IStudentServiceImpl();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("请选择:1.增 2.删 3.改 4.查 5.退出");
            switch (scanner.nextInt()){
                case 1:
                    iStudentService.insertStu();
                    break;
                case 2:
                    iStudentService.deleteStu();
                    break;
                case 3:
                    iStudentService.updateStu();
                    break;
                case 4:
                    iStudentService.queryStu();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}
