//package com.Main.mapper;
//
//import com.Main.pojo.Student;
//import org.apache.ibatis.annotations.Insert;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Select;
//
//import java.time.LocalDate;
//import java.util.List;
//
//
//@Mapper
//public interface StudentMapper {
//    //查询总记录数
////    @Select("select count(*) from emp")
////    public Long count();
////    //分页查询，获取列表数据
////    @Select("select *from emp limit #{start},#{pageSize}")
////    public List<Emp> page(Integer start,Integer pageSize);
////    @Select("select *from emp")
//    public List<Student> list(String name,String username,Short address);
//    //批量删除
//    void delete(List<Integer> ids);
//    //新增员工
//
//    @Insert("insert into student(id, username, job,image, name,workdate,address) " +
//            "values (#{id},#{username},#{job},#{image},#{name},#{workdate},#{address})")
//    void insert(Student student);
//
//    //根据ID查询员工
//    @Select("select *from student where id=#{id}")
//    Student getById(Integer id);
//
//    //更新员工
//    void update(Student student);
//
//    //根据用户名和密码查询员工
//    @Select("select *from student where username=#{username}")
//    Student getByUsernameAndPassword(Student student);
//}


package com.Main.mapper;

import com.Main.pojo.Student;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDate;
import java.util.List;


@Mapper
public interface StudentMapper {
    //查询总记录数
//    @Select("select count(*) from emp")
//    public Long count();
//    //分页查询，获取列表数据
//    @Select("select *from emp limit #{start},#{pageSize}")
//    public List<Student> page(Integer start,Integer pageSize);
//    @Select("select *from student")
    public List<Student> list(String name,String username,Short address);
    //批量删除
    void delete(List<Integer> ids);
    //新增员工

    @Insert("insert into student( username, job,image, name,workdate,address) " +
            "values (#{username},#{job},#{image},#{name},#{workdate},#{address})")
    void insert(Student student);

    //根据ID查询员工
    @Select("select *from student where id=#{id}")
    Student getById(Integer id);

    //更新员工
    void update(Student student);

    //根据用户名和密码查询员工
    @Select("select *from student where username=#{username}")
    Student getByUsernameAndPassword(Student student);
}