package com.Main.mapper;


import com.Main.pojo.Emp;
import org.apache.ibatis.annotations.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

@Mapper
public interface EmpMapper {
    @Delete("delete from emp where id=")
    //public void delete(Integer id);
    public int delete(Integer id);
    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into emp(username,name,gender,image,job,entrydate,dept_id,create_time,update_time)"+
            "values(#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    public void insert(Emp emp);

    @Update("update emp set username=#{username},name=#{name},gender=#{gender},image=#{image},"+
            "job=#{job},entrydate=#{entrydate}, dept_id=#{deptId}, update_time=#{updateTime} where id=#{id}")
    public void update(Emp emp);
    //部分字段名字与所查询字段名字不同，导致查询字段为空
//    @Select("select * from emp where id=#{id}")
//    public Emp getById(Integer id);
    //给字段起别名，让别名与实体类属性一致
//    @Select("select id,username,password,name,gender,image,job,entrydate,"+
//    "dept_id deptId,create_time createTime,update_time updateTime from emp where id =#{id}")
//    public Emp getById(Integer id);
    //通过@Results。@Result注解手动映射封装
    @Results({
            @Result(column="dept_id",property ="deptId"),
            @Result(column="create_time",property ="createTime"),
            @Result(column="update_time",property ="updateTime"),
    })
    @Select("select * from emp where id=#{id}")
    public Emp getById(Integer id);
    //开启mybatis的驼峰命名自动映射开关


    //条件查询员工
//    @Select("select * from emp where name like '%${name}%' and gender=#{gender} and"+
//            "entrydate between #{begin} and #{end} order by update_time desc")
//    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);

//    @Select("select * from emp where name like concat ('%',#{name},'%') and gender=#{gender} and "+
//            "entrydate between #{begin} and #{end} order by update_time desc")
//    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
//动态条件查询
    public List<Emp> list(String name, Short gender, LocalDate begin, LocalDate end);
    //动态更新员工
    public void update2(Emp emp);
//    批量删除员工
    public void deleteById(List<Integer>ids);
}
