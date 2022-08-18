package com.wen.service;

import com.wen.entity.PageData;
import com.wen.entity.Student;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/5 16:54
 */
public interface IStudentService {
    /**
     * 查询全部学生信息
     * @return
     */
    List<Map<String,Object>> allStudent();

    /**
     * 添加新的学生
     * @param student
     * @return
     */
    int insertStu(Student student);

    /**
     * 删除学生
     * @param stuId
     * @return
     */
    int deleteStu(Integer stuId);

    /**
     * 修改学生信息
     * @param student
     * @return
     */
    int updateStu(Student student);

    /**
     * 通过id查询
     * @param stuId
     * @return
     */
    Student selectByStuId(Integer stuId);

    PageData queryByPage(Integer pageNo,Integer pageSize);

    List<Map<String,Object>> querySOmeStu(String search);
}
