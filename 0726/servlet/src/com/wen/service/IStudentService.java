package com.wen.service;

import java.text.ParseException;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 16:25
 */
public interface IStudentService {
    boolean insertStu() throws ParseException;
    boolean deleteStu();
    boolean updateStu() throws ParseException;
    boolean selectStu();
}
