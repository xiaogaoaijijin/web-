package com.Main.service;

import com.Main.pojo.Emp;
import com.Main.pojo.PageBean;

import java.time.LocalDate;
import java.util.List;

public interface EmpService {
    //分页查询
    PageBean page(Integer page, Integer pageSize, String name, Short gender, LocalDate begin,LocalDate end);
    //批量删除
    void delete(List<Integer> ids);
    //增添员工
    void save(Emp emp);
    //根据id查询员工
    Emp getById(Integer id);
//更新员工
    void update(Emp emp);

    Emp login(Emp emp);
}
