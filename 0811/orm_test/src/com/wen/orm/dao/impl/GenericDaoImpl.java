package com.wen.orm.dao.impl;

import com.wen.annotation.ColumnInformation;
import com.wen.annotation.PrimaryKey;
import com.wen.annotation.Table;
import com.wen.orm.dao.IGenericDao;
import com.wen.orm.util.BaseDao;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/11 15:00
 */
public class GenericDaoImpl<T> implements IGenericDao<T> {
    private String getSql(Class t,String sign) {
        StringBuilder sql = new StringBuilder();
        if(t.isAnnotationPresent(Table.class)){
            Table table = (Table) t.getAnnotation(Table.class);
            Field[] declaredFields = t.getDeclaredFields();

            StringBuilder colSql = new StringBuilder();

            int count = 0;
            String colNameByPrimaryKey ="";
            switch (sign){
                case "selectAll":
                    sql.append("select ");
                    for (Field f:declaredFields) {
                        ColumnInformation annotation = f.getAnnotation(ColumnInformation.class);
                        colSql.append(annotation.colName()+",");
                    }
                    sql.append(colSql.substring(0,colSql.length()-1)).append(" from ").append(table.tableName());
                    break;
                case "insert":
                    sql.append("insert into ");
                    sql.append(table.tableName());
                    sql.append("(");

                    for (Field f:declaredFields) {
                        if(f.isAnnotationPresent(PrimaryKey.class)){
                            continue;
                        }
                        ColumnInformation annotation = f.getAnnotation(ColumnInformation.class);
                        colSql.append(annotation.colName()+",");
                        count++;
                    }
                    sql.append(colSql.substring(0,colSql.length()-1));
                    sql.append(") value (?");
                    for (int i = 0; i < count-1; i++) {
                        sql.append(",?");
                    }
                    sql.append(")");
                    break;
                case "update":
                    sql.append("update ");
                    sql.append(table.tableName());
                    sql.append(" set ");
                    for (Field f:declaredFields) {
                        ColumnInformation annotation = f.getAnnotation(ColumnInformation.class);
                        if(f.isAnnotationPresent(PrimaryKey.class)){
                            colNameByPrimaryKey = annotation.colName();
                            continue;
                        }
                        colSql.append(annotation.colName()+"= ?,");
                    }
                    sql.append(colSql.substring(0,colSql.length()-1));
                    sql.append(" where "+colNameByPrimaryKey+"= ?");
                    break;
                case "delete":
                    sql.append("delete from ");
                    sql.append(table.tableName());
                    for (Field f:declaredFields) {
                        ColumnInformation annotation = f.getAnnotation(ColumnInformation.class);
                        if(f.isAnnotationPresent(PrimaryKey.class)){
                            colNameByPrimaryKey = annotation.colName();
                            break;
                        }
                    }
                    sql.append(" where "+colNameByPrimaryKey+"= ?");
                    break;
                default:
                    break;
            }
        }
        return sql.toString();
    }
    @Override
    public List<Map<String, Object>> listAll(T t) {
        String sql = getSql(t.getClass(),"selectAll");
        System.out.println(sql);
        return BaseDao.executeQuery(sql,null);
    }

    @Override
    public int insert(T t) {
        Class<?> aClass = t.getClass();
        String sql = getSql(aClass,"insert");
        System.out.println(sql);

        Field[] declaredFields = aClass.getDeclaredFields();
        Object[] params  = new Object[declaredFields.length];
        int i = 0;
        for (Field field:declaredFields) {
            if(field.isAnnotationPresent(PrimaryKey.class)){
                continue;
            }
            try {
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor(field.getName(), aClass);
                Method readMethod = propertyDescriptor.getReadMethod();
                params[i++] = readMethod.invoke(t);
            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        System.out.println(i);
        Object[] newParams = new Object[i];
        System.arraycopy(params,0,newParams,0,i);

        for (Object o :newParams) {
            System.out.println(o);
        }
        return BaseDao.executeUpdate(sql,newParams);
    }

    @Override
    public int update(T t) {
        Class<?> aClass = t.getClass();
        String sql = getSql(aClass,"update");
        System.out.println(sql);

        Field[] declaredFields = aClass.getDeclaredFields();
        Object oByPrimaryKey = "";
        Object[] params = new Object[declaredFields.length];
        int i = 0;
        for (Field f:declaredFields) {
            try {
                PropertyDescriptor propertyDescriptor = new PropertyDescriptor(f.getName(), aClass);
                if(f.isAnnotationPresent(PrimaryKey.class)){
                    oByPrimaryKey = propertyDescriptor.getReadMethod().invoke(t);
                }else {
                    params[i++] = propertyDescriptor.getReadMethod().invoke(t);
                }
            } catch (IntrospectionException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        params[i] = oByPrimaryKey;
        for (Object o: params) {
            System.out.println(o);
        }
        return BaseDao.executeUpdate(sql,params);
    }

    @Override
    public int delete(T t) {
        Class<?> aClass = t.getClass();
        String sql = getSql(aClass,"delete");
        System.out.println(sql);
        Field[] declaredFields = aClass.getDeclaredFields();
        Object[] params = null;
        for (Field f:declaredFields) {
            if(f.isAnnotationPresent(PrimaryKey.class)){
                try {
                    params = new Object[]{new PropertyDescriptor(f.getName(),aClass).getReadMethod().invoke(t)};
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                } catch (IntrospectionException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println(params[0]);
        return BaseDao.executeUpdate(sql,params);
    }
}
