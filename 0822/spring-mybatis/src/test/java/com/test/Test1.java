package com.test;

import com.entity.Goods;
import com.mapper.GoodsMapper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author :muxiaowen
 * @date : 2022/8/22 17:51
 */
public class Test1 {
    public static void main(String[] args) {
/*        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-mybatis.xml");

        GoodsMapper goodsMapper = ac.getBean(GoodsMapper.class);
        goodsMapper.select(null).forEach(System.out::println);

        goodsMapper.deleteByPrimaryKey(19);

        goodsMapper.insert(new Goods(null,"井**盖",120.3,java.sql.Date.valueOf("2022-8-22"),"云",2));

        goodsMapper.updateByPrimaryKey(new Goods(17,"#井盖#",120.3,java.sql.Date.valueOf("2022-8-22"),"云",2));

        goodsMapper.select(null).forEach(System.out::println);*/
    }
}
