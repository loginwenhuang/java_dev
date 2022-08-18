package com.interceptor;

import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.*;
import org.apache.ibatis.reflection.MetaObject;
import org.apache.ibatis.reflection.SystemMetaObject;

import java.sql.Connection;
import java.util.Properties;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 16:35
 */
@Intercepts(
        @Signature(
                type = StatementHandler.class,
                method = "prepare",
                args = {Connection.class,Integer.class}
        )
)
public class MyPageInterceptor implements Interceptor {
    private String start;
    private String end;
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        Object target = invocation.getTarget();
        MetaObject metaObject = SystemMetaObject.forObject(target);
        String oldSql = metaObject.getValue("delegate.boundSql.sql").toString();

        System.out.println("oldSql:"+oldSql);

        String newSql = oldSql+" limit "+start+","+end;
        System.out.println("newSql"+newSql);

        metaObject.setValue("delegate.boundSql.sql",newSql);

        return invocation.proceed();
    }

    @Override
    public Object plugin(Object target) {
        if(target instanceof StatementHandler){
            return Plugin.wrap(target, this);
        }
        return target;
    }

    @Override
    public void setProperties(Properties properties) {
        start = properties.getProperty("start");
        end = properties.getProperty("end");
    }
}
