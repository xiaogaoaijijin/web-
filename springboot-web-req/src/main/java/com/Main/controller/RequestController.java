package com.Main.controller;

import com.Main.pojo.User;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;


//测试请求参数接受
@RestController
public class RequestController {
    //原始方法
//    @RequestMapping("/simpleParam")
//    public String simpleParam(HttpServletRequest request){
//        String name=request.getParameter("name");
//        String ageStr=request.getParameter("age");
//        int age=Integer.parseInt(ageStr);
//        System.out.println(name+":"+age);
//        return "OK";
//    }

//springboot方法

    @RequestMapping("/simpleParam")
    public String simpleParam(@RequestParam(name="name",required = false) String name,//required为false表示该属性可选，无论存在与否都不会报错
                              @RequestParam(name="age",required = false) Integer age){
        System.out.println(name+":"+age);
        return "OK";
    }

    //简单实体参数
    @RequestMapping("/simplepojo")
    public String simplepojo(User user){
        System.out.println(user);
        return "OK";
    }

    //复杂实体参数
    @RequestMapping("/complexpojo")
    public String complexpojo(User user){
        System.out.println(user);
        return "OK";
    }
    //数组集合参数
    @RequestMapping("/arrayParam")
    public String arrayParam(String[] hobby){
        System.out.println(Arrays.toString(hobby));
        return "OK";
    }

    @RequestMapping("/listParam")
    public String listParam(@RequestParam List<String> hobby){
        System.out.println(hobby);
        return "OK";
    }

    //日期时间参数
    @RequestMapping("/dateParam")
    public String dateParam(@DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")LocalDateTime updateTime){
        System.out.println(updateTime);
        return "OK";
    }
    //json参数
    @RequestMapping("/jsomParam")
    public String jsonParam(@RequestBody User user){
        System.out.println(user);
        return "OK";
    }

    //路径参数
    @RequestMapping("/path/{id}")
    public String pathParam(@PathVariable Integer id){
        System.out.println(id);
        return "OK";
    }

    @RequestMapping("/path/{id}/{name}")
    public String pathParam2(@PathVariable Integer id,@PathVariable String name){
        System.out.println(id);
        System.out.println(name);
        return "OK";
    }
}






