package com.zhangchao.mybatis.controller;

import com.zhangchao.mybatis.Entity.JsonResult;
import com.zhangchao.mybatis.Entity.User;
import com.zhangchao.mybatis.service.serviceImpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl service;

    @PostMapping("/getUserList")
    public JsonResult getUserList(){
        return new JsonResult(1,"成功",service.getUserList());
    }
}
