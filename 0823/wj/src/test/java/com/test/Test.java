package com.test;

import com.entity.Book;
import com.mapper.BookMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/23 9:06
 */
public class Test {
    public static void main(String[] args) {
/*        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        BookMapper bean = ac.getBean(BookMapper.class);
        //增
        bean.insert(new Book(null,"西游记1","吴承恩",42.0,
                java.sql.Date.valueOf("2022-8-8")));
        bean.insert(new Book(null,"**#","吴##",22.0,
                java.sql.Date.valueOf("2022-8-1")));
        //改
        bean.updateByPrimaryKey(new Book(3,"西游记(三)","吴某",22.0,
                java.sql.Date.valueOf("2022-8-1")));
        //删
        bean.deleteByPrimaryKey(3);
        //查
        bean.select(null).forEach(System.out::println);
    }*/
    }
}
