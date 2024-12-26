package com.Main.mapper;

import com.Main.pojo.Kaoqin;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface KaoqinMapper {
    //    查询全部部门数据
    @Select("select * from kaoqin")
    List<Kaoqin> list();
    //根据ID删除部门
    @Delete("delete from kaoqin where id=#{id}")
    void deleteById(Integer id);


    //void insert(Dept dept);
    @Insert("insert into kaoqin(name,shangban,xiaban,chidao,zaotui,mounth,jifen,create_time,update_time) values (#{name},#{shangban},#{xiaban},#{chidao},#{zaotui},#{mounth},#{jifen},#{createTime},#{updateTime})")
    void insert(Kaoqin kaoqin);

    @Update("update kaoqin set name=#{name},shangban=#{shangban},xiaban=#{xiaban},chidao=#{chidao},zaotui=#{zaotui},mounth=#{mounth},jifen=#{jifen},update_time=#{updateTime} where id=#{id}")
    void update(Kaoqin kaoqin);

    @Select("select *from kaoqin where id=#{id}")
    Kaoqin selectById(Integer id);
}