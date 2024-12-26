package com.Main.controller;

import com.Main.pojo.Emp;
import com.Main.pojo.Result;
import com.Main.service.EmpService;
import com.Main.utils.JwtUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@Slf4j
@RestController
public class LoginController {
    @Autowired
    private EmpService empService;
    @PostMapping("/login")
    public Result login(@RequestBody Emp emp){
        log.info("员工登录:{}",emp);
        Emp e=empService.login(emp);
        //登陆成功


        if(e!=null) {
            Map<String, Object> claims=new HashMap<>();
            claims.put("id", e.getId());
            claims.put("name", e.getName());
            claims.put("username", e.getUsername());
            String jwt = JwtUtils.generateJwt(claims);//jwt包含了当前登录的员工信息
            return Result.success(jwt);
        }
        //登陆失败
        return Result.error("用户名或密码错误");
    }
}
