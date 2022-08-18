package com.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.Properties;

/**
 * 注释的内容为  返回值类型+方法名+参数类型
 * @author :muxiaowen
 * @date : 2022/8/18 19:58
 */
@Intercepts(
        @Signature(
                type = StatementHandler.class,
                method = "prepare",
                args = {Connection.class,Integer.class}
        )
)
public class NewInterceptor implements Interceptor {
    private String start;
    private String end;
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        System.out.println("拦截statementHandler");
        StatementHandler target =(StatementHandler)invocation.getTarget();
        //BoundSql 执行sql的相关信息
        String oldSql = target.getBoundSql().getSql();
        String newSql = oldSql+" limit "+start+","+end;
        MetaObject metaObject = SystemMetaObject.forObject(target);
        metaObject.setValue("delegate.boundSql.sql",newSql);
        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if(target instanceof StatementHandler){
            //生成一个代理对象并返回
            System.out.println("生成代理对象");
            return Plugin.wrap(target,this);
        }
        return target;
    }

    @Override
    public void setProperties(Properties properties) {
        System.out.println("初始化设置参数");
        start = properties.getProperty("start");
        end = properties.getProperty("end");
    }
}
