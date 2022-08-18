package com.wen.service;

/**
 * @author :muxiaowen
 * @date : 2022/7/24 20:19
 */
public interface IBookService {
    /**
     * 阅读
     * @return
     */
    boolean read();

    /**
     * 添加书籍
     * @return
     */
    boolean addBooks();

    /**
     * 删除图书
     * @return
     */
    boolean deleteBooks();

    /**
     * 更新书籍信息
     * @return
     */
    boolean updateBookInformation();

}
