package com.Main.mapper;

import com.Main.pojo.Emp;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;


@Mapper
public interface EmpMapper {
    //查询总记录数
//    @Select("select count(*) from emp")
//    public Long count();
//    //分页查询，获取列表数据
//    @Select("select *from emp limit #{start},#{pageSize}")
//    public List<Emp> page(Integer start,Integer pageSize);
//    @Select("select *from emp")
    public List<Emp> list(String name, Short gender, LocalDate begin,LocalDate end);
//批量删除
    void delete(List<Integer> ids);
    //新增员工

    @Insert("insert into emp(username,name,gender,image,job,entrydate,dept_id,create_time,update_time) " +
            "values (#{username},#{name},#{gender},#{image},#{job},#{entrydate},#{deptId},#{createTime},#{updateTime})")
    void insert(Emp emp);

    //根据ID查询员工
    @Select("select *from emp where id=#{id}")
    Emp getById(Integer id);

    //更新员工
    void update(Emp emp);

    //根据用户名和密码查询员工
    @Select("select *from emp where username=#{username} and password=#{password}")
    Emp getByUsernameAndPassword(Emp emp);
}
