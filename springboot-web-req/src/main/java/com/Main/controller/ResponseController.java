package com.Main.controller;

import com.Main.pojo.Address;
import com.Main.pojo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ResponseController {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("Hello,world");
        return "Hello world";
    }
    @RequestMapping("/getAddr")
    public Result getAddr(){
        Address addr=new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        return Result.success(addr);
    }
    @RequestMapping("/listAddr")
    public Result listAddr(){
        List<Address>list=new ArrayList<>();
        Address addr =new Address();
        addr.setProvince("广东");
        addr.setCity("深圳");
        Address addr2 =new Address();
        addr.setProvince("陕西");
        addr.setCity("西安");
        list.add(addr);
        list.add(addr2);
        return Result.success(list);
    }
}
