package com.Main.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellocontroller {
    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hello,world");
        return "hello,world";
    }
}


