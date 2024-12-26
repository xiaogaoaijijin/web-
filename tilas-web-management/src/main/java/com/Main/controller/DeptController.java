package com.Main.controller;

import com.Main.pojo.Dept;

import com.Main.pojo.Result;
import com.Main.service.DeptService;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.awt.*;
import java.util.List;

@Slf4j
@CrossOrigin
@RestController
public class DeptController {
    //private static Logger log= LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private DeptService deptService;
    //查询部门
    //@RequestMapping(value = "/depts",method = RequestMethod.GET)//指定请求方式为GET
    @GetMapping("/depts")
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Dept> deptList=deptService.list();
       // return com.Main.pojo.Result.success(deptList);
      return Result.success(deptList);
    }
    //删除部门
    @DeleteMapping("/depts/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门：{}",id);
        deptService.delete(id);
        return Result.success();
    }
    //新增部门
    @PostMapping("/depts")
    public Result add(@RequestBody Dept dept){
        log.info("新增部门：{}",dept);
        //调用service新增部门
        deptService.add(dept);
        return Result.success();
    }
    //修改部门
    @GetMapping("/depts/{id}")
    public Result selectById(@PathVariable Integer id){
        Dept dept=deptService.selectById(id);
        return Result.success(dept);
    }
    @PutMapping("/depts")
    public Result update(@RequestBody Dept dept){
        log.info("修改部门:{}",dept);
        //调用service修改部门
        deptService.update(dept);
        return Result.success();
    }
}
