package com.wen.util;

/**
 * @author :muxiaowen
 * @date : 2022/7/26 8:19
 */
public class ConGenUtil {
    public static String getJavaType(String dbType){
        if("INT".equalsIgnoreCase(dbType)){
            return "Integer";
        }else if("CAHR".equalsIgnoreCase(dbType)
            ||"VARCHAR".equalsIgnoreCase(dbType)){
            return "String";
        }else if("DATE".equalsIgnoreCase(dbType)
            ||"DATETIME".equalsIgnoreCase(dbType)
            ||"TIMESTAMP".equalsIgnoreCase(dbType)){
            return "Date";
        }else if("DOUBLE".equalsIgnoreCase(dbType)
            ||"FLOAT".equalsIgnoreCase(dbType)
            ||"DECIMAL".equalsIgnoreCase(dbType)){
            return "Double";
        }
        return null;
    }
}
