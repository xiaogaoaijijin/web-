package com.Main.service;

import com.Main.pojo.Classes;

import java.util.List;

public interface ClassesService {
    //    查询全部部门数据
    List<Classes> list();
    //删除部门
    void delete(Integer id);
    //新增部门
    void add(Classes classes);

    void update(Classes classes);

    Classes selectById(Integer id);
}
