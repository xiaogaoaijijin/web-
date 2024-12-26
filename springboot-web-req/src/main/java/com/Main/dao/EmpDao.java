package com.Main.dao;

import com.Main.pojo.Emp;

import java.util.List;

public interface EmpDao {
    //获取员工列表数据
    public List<Emp> listEmp();
}
