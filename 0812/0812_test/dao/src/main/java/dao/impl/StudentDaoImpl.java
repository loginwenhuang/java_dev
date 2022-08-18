package dao.impl;

import dao.IStudentDao;
import util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 11:41
 */
public class StudentDaoImpl implements IStudentDao {
    @Override
    public List<Map<String, Object>> listAll() {
        return BaseDao.executeQuery("select * from student",null);
    }
}
