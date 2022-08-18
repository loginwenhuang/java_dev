package test;

import com.dao.IBookDao;
import com.dao.impl.BookDaoImpl;
import com.entity.Book;
import com.entity.Good;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/15 9:18
 */

public class MyTest {
    public static void main(String[] args) throws ParseException {
        IBookDao bookDao = new BookDaoImpl();
        Book book = new Book(1,"西游记1","罗",25.5,"人民出版社",new SimpleDateFormat("yyyy-MM-dd").parse("2022-8-1"));
        bookDao.insert(book);
        bookDao.bookList();
        book  = new Book(2,"西行记","罗",25.5,"教育出版社",new SimpleDateFormat("yyyy-MM-dd").parse("2022-8-1"));
        bookDao.update(book);
        bookDao.delete(1);

    }

}
