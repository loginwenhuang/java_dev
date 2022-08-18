package service.impl;

import dao.IStudentDao;
import dao.impl.StudentDaoImpl;
import service.IStudentService;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/12 14:44
 */
public class StudentServiceImpl implements IStudentService {
    private IStudentDao studentDao = new StudentDaoImpl();
    @Override
    public List<Map<String, Object>> listAll() {
        return studentDao.listAll();
    }
}
