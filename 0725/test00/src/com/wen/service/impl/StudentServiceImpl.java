package com.wen.service.impl;

import com.wen.dao.IStudentDao;
import com.wen.dao.Impl.StudentDaoImpl;
import com.wen.enity.Student;
import com.wen.service.IStudentService;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 14:17
 */
public class StudentServiceImpl implements IStudentService {
    Scanner scanner = new Scanner(System.in);
    IStudentDao iStudentDao = new StudentDaoImpl();
    Student student =  null;
    @Override
    public boolean insertStu() throws ParseException {
        System.out.println("请依次输入学生信息:姓名,性别,年龄");
        student = new Student(scanner.next(),scanner.next(),new SimpleDateFormat("yy-MM-dd").parse(scanner.next()));
        return iStudentDao.insertStu(student)>0;
    }

    @Override
    public boolean deleteStu() {
        System.out.println("请输入学生id");
        return iStudentDao.deleteStu(scanner.nextInt())>0;
    }

    @Override
    public boolean updateStu() throws ParseException {
        System.out.println("请依次输入学生信息:学号,姓名,性别,年龄");
        student = new Student(scanner.nextInt(),scanner.next(),scanner.next(),new SimpleDateFormat("yy-MM-dd").parse(scanner.next()));
        return iStudentDao.updateStu(student)>0;
    }

    @Override
    public boolean selectStu() {
        System.out.println("请选择:1.全体查询 2.id查询");
        switch (scanner.nextInt()){
            case 1:
                if(iStudentDao.selectAllStu()==null){
                    return false;
                }
                for (Student student:iStudentDao.selectAllStu()) {
                    System.out.println(student);
                }
                return true;
            case 2:
                System.out.println("请输入学生id");
                if((student = iStudentDao.selectStu(scanner.nextInt()))!=null){
                    System.out.println(student);
                    return true;
                }
                return false;
            default:
                System.out.println("输入有误!");
                break;
        }
        return false;
    }
}
