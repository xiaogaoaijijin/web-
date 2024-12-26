package com.Main.mapper;

import com.Main.pojo.Classes;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ClassesMapper {
    //    查询全部部门数据
    @Select("select * from classes")
    List<Classes> list();
    //根据ID删除部门
    @Delete("delete from classes where id=#{id}")
    void deleteById(Integer id);

    @Insert("insert into classes(name,create_time,update_time) values (#{name},#{createTime},#{updateTime})")
    void insert(Classes classes);

    @Update("update classes set name=#{name},update_time=#{updateTime} where id=#{id}")
    void update(Classes classes);

    @Select("select *from classes where id=#{id}")
    Classes selectById(Integer id);
}
