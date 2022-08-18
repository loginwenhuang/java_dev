package com.wen.dao.impl;

import com.mysql.cj.util.StringUtils;
import com.wen.dao.IStaffDao;
import com.wen.entity.Staff;
import com.wen.util.BaseDao;

import java.util.List;
import java.util.Map;

/**
 * @author :muxiaowen
 * @date : 2022/8/8 14:49
 */
public class StaffDaoImpl implements IStaffDao {
    @Override
    public List<Map<String, Object>> queryStaff() {
        String sql = "select s_id,s_name,sex,birthday,phone,d_name" +
                "   from staffInfo join department" +
                "   on staffInfo.d_id = department.d_id";
        return BaseDao.executeQuery(sql,null);
    }

    @Override
    public List<Map<String, Object>> querySomeStaff(String search) {
        if(StringUtils.isNullOrEmpty(search)){
            return queryStaff();
        }
        StringBuilder searchSql  = new StringBuilder();
        searchSql.append("and s_name like ?");
        String sql = "select s_id,s_name,sex,birthday,phone,d_name" +
                "   from staffInfo join department" +
                "   on staffInfo.d_id = department,d_id" +
                "   where 1=1 "+searchSql;
        return BaseDao.executeQuery(sql,new Object[]{
                "%"+search+"%"
        });
    }

    @Override
    public int insertStaff(Staff staff) {
        String sql = "insert into staffInfo(s_name,sex,birthday,phone,d_id)" +
                "   value" +
                "   (?,?,?,?,?)";
        return BaseDao.executeUpdate(sql,new Object[]{
                staff.getS_name(),
                staff.getSex(),
                staff.getBirthday(),
                staff.getPhone(),
                staff.getD_id(),
        });
    }
}
