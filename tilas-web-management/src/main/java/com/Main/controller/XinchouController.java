package com.Main.controller;

import com.Main.pojo.Xinchou;

import com.Main.pojo.Result;
import com.Main.service.XinchouService;
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
public class XinchouController {
    //private static Logger log= LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private XinchouService xinchouService;
    //查询部门
    //@RequestMapping(value = "/depts",method = RequestMethod.GET)//指定请求方式为GET
    @GetMapping("/xinchou")
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Xinchou> xinchouList=xinchouService.list();
        // return com.Main.pojo.Result.success(deptList);
        return Result.success(xinchouList);
    }
    //删除部门
    @DeleteMapping("/xinchou/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门：{}",id);
        xinchouService.delete(id);
        return Result.success();
    }
    //新增部门
    @PostMapping("/xinchou")
    public Result add(@RequestBody Xinchou xinchou){
        log.info("新增部门：{}",xinchou);
        //调用service新增部门
        xinchouService.add(xinchou);
        return Result.success();
    }
    //修改部门
    @GetMapping("/xinchou/{id}")
    public Result selectById(@PathVariable Integer id){
        Xinchou xinchou=xinchouService.selectById(id);
        return Result.success(xinchou);
    }
    @PutMapping("/xinchou")
    public Result update(@RequestBody Xinchou xinchou){
        log.info("修改部门:{}",xinchou);
        //调用service修改部门
        xinchouService.update(xinchou);
        return Result.success();
    }
}
