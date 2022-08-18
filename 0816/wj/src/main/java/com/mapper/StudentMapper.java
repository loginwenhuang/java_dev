package com.mapper;

import com.entity.StudentInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/16 9:07
 */
public interface StudentMapper {
    List<StudentInfo> studentList();

    List<StudentInfo> studentList1(@Param("studentId") Integer studentId,
                                   @Param("classId") Integer classId);
    List<StudentInfo> studentList2(@Param("startId") Integer startId,
                                   @Param("endId") Integer endId);

    List<StudentInfo> listByStu(StudentInfo studentInfo);

}
