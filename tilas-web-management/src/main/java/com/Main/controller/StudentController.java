//package com.Main.controller;
//
//import com.Main.pojo.Student;
//import com.Main.pojo.PageBean;
//import com.Main.pojo.Result;
//import com.Main.service.StudentService;
//import lombok.Data;
//import lombok.extern.slf4j.Slf4j;
//import org.apache.ibatis.annotations.Delete;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.format.annotation.DateTimeFormat;
//import org.springframework.web.bind.annotation.*;
//
//import java.time.LocalDate;
//import java.util.List;
//
//@Slf4j
//@CrossOrigin
//@RestController
//@RequestMapping("/student")
//public class StudentController {
//    @Autowired
//    private StudentService studentService;
//    @GetMapping
//    public Result page(@RequestParam(defaultValue = "1") Integer page,
//                       @RequestParam(defaultValue = "10") Integer pageSize,
//                       String name,String username,Short address)
//    {
//        log.info("分页查询，参数：{}，{},{},{},{}",page,pageSize,name,username,address);
//        PageBean pageBean=studentService.page(page,pageSize,name,username,address);
//        return Result.success(pageBean);
//    }
//    @DeleteMapping("/{ids}")
//    public Result delete(@PathVariable List<Integer> ids){
//        log.info("批量删除操作,ids:{}",ids);
//        studentService.delete(ids);
//        return Result.success();
//    }
//    @PostMapping
//    public Result save(@RequestBody Student student){
//        log.info("新增员工,student:{}",student);
//        studentService.save(student);
//        return Result.success();
//    }
//    @GetMapping("/{id}")
//    public Result getById(@PathVariable Integer id){
//        log.info("根据ID查询员工信息,id:{}",id);
//        Student student= studentService.getById(id);
//        return Result.success(student);
//    }
//    @PutMapping
//    public Result update(@RequestBody Student student){
//        log.info("更新员工信息:{}",student);
//        studentService.update(student);
//        return Result.success();
//
//    }
//}
//

package com.Main.controller;

import com.Main.pojo.Student;
import com.Main.pojo.PageBean;
import com.Main.pojo.Result;
import com.Main.service.StudentService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.annotations.Delete;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@Slf4j
@CrossOrigin
@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @GetMapping
    public Result page(@RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer pageSize,
                       String name,String username,Short address)
    {
        log.info("分页查询，参数：{}，{},{},{},{}",page,pageSize,name,username,address);
        PageBean pageBean=studentService.page(page,pageSize,name,username,address);
        return Result.success(pageBean);
    }
    @DeleteMapping("/{ids}")
    public Result delete(@PathVariable List<Integer> ids){
        log.info("批量删除操作,ids:{}",ids);
        studentService.delete(ids);
        return Result.success();
    }
    @PostMapping
    public Result save(@RequestBody Student student){
        log.info("新增员工,student:{}",student);
        studentService.save(student);
        return Result.success();
    }
    @GetMapping("/{id}")
    public Result getById(@PathVariable Integer id){
        log.info("根据ID查询员工信息,id:{}",id);
        Student student= studentService.getById(id);
        return Result.success(student);
    }
    @PutMapping
    public Result update(@RequestBody Student student){
        log.info("更新员工信息:{}",student);
        studentService.update(student);
        return Result.success();

    }
}

