package com.mapper;

import com.entity.Class;
import com.entity.Student;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author :muxiaowen
 * @date : 2022/8/18 10:17
 */
public interface ClassInfoMapper {
    @Select("select * from class")
    List<Class> studentList();
    @Insert("insert into class(name) value (#{name})")
    int insert(Class c);
    @Update("update class set name = #{name} where id = #{id}")
    int update(Class c);
    @Delete("delete from class where id = #{id}")
    int delete(Integer id);
}
