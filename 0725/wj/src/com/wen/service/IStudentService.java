package com.wen.service;

import java.text.ParseException;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 9:03
 */
public interface IStudentService {
    boolean insertStu() throws ParseException;
    boolean queryStu();
    boolean updateStu();
    boolean deleteStu();
}
