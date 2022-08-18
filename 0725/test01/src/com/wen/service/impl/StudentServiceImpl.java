package com.wen.service.impl;

import com.wen.dao.IStudentDao;
import com.wen.dao.impl.StudentDaoImpl;
import com.wen.enity.Student;
import com.wen.service.IStudentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 16:26
 */
public class StudentServiceImpl implements IStudentService {
    IStudentDao iStudentDao = new StudentDaoImpl();
    Scanner scanner = new Scanner(System.in);
    Student student = null;
    @Override
    public boolean insertStu() throws ParseException {
        System.out.println("依次输入学生的姓名，性别，生日");
        student =new Student(
                scanner.next(),
                scanner.next(),
                new SimpleDateFormat("yyyy-MM-dd").parse(scanner.next())
        );
        return iStudentDao.insertStu(student)>0;
    }

    @Override
    public boolean deleteStu() {
        System.out.println("请输入要删除的学生的id");
        return iStudentDao.deleteStu(scanner.nextInt())>0;
    }

    @Override
    public boolean updateStu() throws ParseException {
        System.out.println("请输入要修改的学生的id,姓名,性别,生日");
        student =new Student(
                scanner.nextInt(),
                scanner.next(),
                scanner.next(),
                new SimpleDateFormat("yyyy-MM-dd").parse(scanner.next())
        );
        return iStudentDao.updateStu(student)>0;
    }

    @Override
    public boolean selectStu() {
        System.out.println("请选择:1.查询全部 2.按id查询");
        switch (scanner.nextInt()){
            case 1:
                if(iStudentDao.selectAllStu()!=null){
                    for (Student student : iStudentDao.selectAllStu()) {
                        System.out.println(student);
                    }
                    return true;
                }
                return false;
            case 2:
                System.out.println("请输入学生id:");
                if((student=iStudentDao.selectStu(scanner.nextInt()))!=null){
                    System.out.println(student);
                    return true;
                }
                return false;
            default:
                break;
        }
        return false;
    }
}
