package com.Main.controller;

import com.Main.pojo.Classes;

import com.Main.pojo.Result;
import com.Main.service.ClassesService;
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
public class ClassesController {
    @Autowired
    private ClassesService classesService;
    //查询部门
    @GetMapping("/classes")
    public Result list(){
        log.info("查询全部专业数据");
        //调用service查询部门数据
        List<Classes> classesList=classesService.list();
        return Result.success(classesList);
    }
    //删除部门
    @DeleteMapping("/classes/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除专业：{}",id);
        classesService.delete(id);
        return Result.success();
    }
    //新增部门
    @PostMapping("/classes")
    public Result add(@RequestBody Classes classes){
        log.info("新增专业：{}",classes);
        //调用service新增部门
        classesService.add(classes);
        return Result.success();
    }
    //修改部门
    @GetMapping("/classes/{id}")
    public Result selectById(@PathVariable Integer id){
        Classes classes=classesService.selectById(id);
        return Result.success(classes);
    }
    @PutMapping("/classes")
    public Result update(@RequestBody Classes classes){
        log.info("修改专业:{}",classes);
        //调用service修改部门
        classesService.update(classes);
        return Result.success();
    }
}
