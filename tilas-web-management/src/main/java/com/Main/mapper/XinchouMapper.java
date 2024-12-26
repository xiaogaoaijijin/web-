package com.Main.mapper;

import com.Main.pojo.Xinchou;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface XinchouMapper {
    //    查询全部部门数据
    @Select("select * from xinchou")
    List<Xinchou> list();
    //根据ID删除部门
    @Delete("delete from xinchou where id=#{id}")
    void deleteById(Integer id);


    //void insert(Dept dept);
    @Insert("insert into xinchou(name,jiben,gangwei,jixiao,yingfa,shebao,gongji,shifa,create_time,update_time) values (#{name},#{jiben},#{gangwei},#{jixiao},#{jiben}+#{gangwei}+#{jixiao},#{shebao},#{gongji},#{jiben}+#{gangwei}+#{jixiao}-#{shebao}-#{gongji},#{createTime},#{updateTime})")
    void insert(Xinchou xinchou);

    @Update("update xinchou set name=#{name},jiben=#{jiben},gangwei=#{gangwei},jixiao=#{jixiao},yingfa=#{jiben}+#{gangwei}+#{jixiao},shebao=#{shebao},gongji=#{gongji},shifa=#{jiben}+#{gangwei}+#{jixiao}-#{shebao}-#{gongji},update_time=#{updateTime} where id=#{id}")
    void update(Xinchou xinchou);

    @Select("select *from xinchou where id=#{id}")
    Xinchou selectById(Integer id);
}

