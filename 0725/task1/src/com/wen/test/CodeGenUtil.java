package com.wen.test;

/**
 * @author :muxiaowen
 * @date : 2022/7/25 17:03
 */
public class CodeGenUtil {
    public static String getJavaType(String dbType){
        if("VARCHAR".equalsIgnoreCase(dbType)||
                "CHAR".equalsIgnoreCase(dbType)){
            return "String";
        }else if("DOUBLE".equalsIgnoreCase(dbType)||
                "FLOAT".equalsIgnoreCase(dbType)||
                "DECIMAL".equalsIgnoreCase(dbType)){
            return "Double";
        }else if("INT".equalsIgnoreCase(dbType)){
            return "Integer";
        }else if("DATE".equalsIgnoreCase(dbType)||
                "TIMESTAMP".equalsIgnoreCase(dbType)){
            return "Date";
        }
        return null;
    }
}
