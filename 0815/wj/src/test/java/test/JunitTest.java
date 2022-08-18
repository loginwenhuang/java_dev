package test;

import com.entity.Book;
import com.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 9:43
 */
public class JunitTest {
    private static SqlSessionFactory sessionFactory;
    private SqlSession sqlSession;
    @BeforeClass
    public static void sqlSessionFactory() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("MyBatis.xml");
        sessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
    }

    @Before
    public void sqlSession(){
        sqlSession = sessionFactory.openSession(true);
    }

    @Test
    public void select(){
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        for (Book b:mapper.bookList()) {
            System.out.println(b);
        }
    }

    @Test
    public void selectByBookNameAndPubDate(){
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book book = mapper.getByNameAndPubDate("西游记1",java.sql.Date.valueOf("2022-8-1"));
        System.out.println(book);
    }
    @Test
    public void selectByBookNameAndPubDate2(){
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Book book = mapper.getByNameAndPubDate("西游记1",java.sql.Date.valueOf("2022-8-1"));
        System.out.println(book);
    }

    @Test
    public void getByMap(){
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        Map map = new HashMap();
        map.put("bookName","西游记1");
        map.put("pubDate","2022-8-1");
        Book book = mapper.getByMap(map);
        System.out.println(book);
    }
    @Test
    public void getByBookNameLike(){
        BookMapper mapper = sqlSession.getMapper(BookMapper.class);
        mapper.getByBookNameLike("西");
    }
    @After
    public void close(){
        sqlSession.close();
    }

}
