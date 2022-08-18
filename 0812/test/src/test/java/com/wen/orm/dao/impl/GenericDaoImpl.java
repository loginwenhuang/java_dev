package com.wen.orm.dao.impl;

import com.wen.orm.annotation.ColumnInfo;
import com.wen.orm.annotation.Table;
import com.wen.orm.dao.IGenericDao;
import com.wen.util.BaseDao;
import javafx.scene.control.Tab;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 8:31
 */
public class GenericDaoImpl<T> implements IGenericDao<T>{
    @Override
    public List<Map<String, Object>> allList(T t) {
        Class<?> aClass = t.getClass();
        StringBuilder sql = new StringBuilder();
        if(aClass.isAnnotationPresent(Table.class)){
            sql.append("select ");
            StringBuilder colSql = new StringBuilder();
            Field[] declaredFields = aClass.getDeclaredFields();
            for (Field f: declaredFields) {
                if(f.isAnnotationPresent(ColumnInfo.class)){
                    colSql.append(f.getAnnotation(ColumnInfo.class).colName()+",");
                }
            }
            sql.append(colSql.substring(0,colSql.length()-1)).append(" from "+aClass.getAnnotation(Table.class).tableName());
        }
        return BaseDao.executeQuery(sql.toString(),null);
    }
}
