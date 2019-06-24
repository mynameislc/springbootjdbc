package com.lc.springbootjdbc.mapper;

import org.apache.ibatis.annotations.*;
import com.lc.springbootjdbc.bean.*;

//指定這是一個操作數據庫的mapper
//@Mapper
public interface depatmentMapper {

    @Select("select * from department where id=#{id}")
    public department getDeparmentById(Integer id);

    @Delete("delete from department where id=#{id}")
    public int deldeptById();

    @Insert("insert into department(departmentName) values(#{departmentName})")
    public int insertdept(department dept);

    @Update("update department set departmentName=#{departmentName} where id=#{id} ")
    public int updatadept();

}