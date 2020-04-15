package com.zhangchao.mybatis.service.serviceImpl;

import com.zhangchao.mybatis.Entity.User;
import com.zhangchao.mybatis.mapper.UserMapper;
import com.zhangchao.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper user;

    @Override
    public List<User> getUserList() {
        return user.getUserList();
    }
}
