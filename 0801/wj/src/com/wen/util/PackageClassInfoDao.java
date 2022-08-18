package com.wen.util;

import com.wen.entity.ClassInfo;

import javax.servlet.http.HttpServletRequest;

/**
 * @author :muxiaowen
 * @date : 2022/8/1 17:17
 */
public class PackageClassInfoDao {

    public static ClassInfo packageClassInfo(HttpServletRequest request){
        Integer classId = null;
        String className;
        try{
            classId = Integer.valueOf(request.getParameter("classId"));
        }catch (Exception e){
            e.printStackTrace();
        }
        className = request.getParameter("className");
        return new ClassInfo(classId,className);
    }
}
