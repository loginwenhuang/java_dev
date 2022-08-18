package com.dao;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 16:13
 */
public interface IStudentDao {
    List<Map> listAll() throws IOException;
}
