package com.Main.controller;

import com.Main.pojo.Kaoqin;

import com.Main.pojo.Result;
import com.Main.service.KaoqinService;
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
public class KaoqinController {
    //private static Logger log= LoggerFactory.getLogger(DeptController.class);
    @Autowired
    private KaoqinService kaoqinService;
    //查询部门
    //@RequestMapping(value = "/depts",method = RequestMethod.GET)//指定请求方式为GET
    @GetMapping("/kaoqin")
    public Result list(){
        log.info("查询全部部门数据");
        //调用service查询部门数据
        List<Kaoqin> kaoqinList=kaoqinService.list();
        // return com.Main.pojo.Result.success(deptList);
        return Result.success(kaoqinList);
    }
    //删除部门
    @DeleteMapping("/kaoqin/{id}")
    public Result delete(@PathVariable Integer id){
        log.info("根据id删除部门：{}",id);
        kaoqinService.delete(id);
        return Result.success();
    }
    //新增部门
    @PostMapping("/kaoqin")
    public Result add(@RequestBody Kaoqin kaoqin){
        log.info("新增部门：{}",kaoqin);
        //调用service新增部门
        kaoqinService.add(kaoqin);
        return Result.success();
    }
    //修改部门
    @GetMapping("/kaoqin/{id}")
    public Result selectById(@PathVariable Integer id){
        Kaoqin kaoqin=kaoqinService.selectById(id);
        return Result.success(kaoqin);
    }
    @PutMapping("/kaoqin")
    public Result update(@RequestBody Kaoqin kaoqin){
        log.info("修改部门:{}",kaoqin);
        //调用service修改部门
        kaoqinService.update(kaoqin);
        return Result.success();
    }
}
