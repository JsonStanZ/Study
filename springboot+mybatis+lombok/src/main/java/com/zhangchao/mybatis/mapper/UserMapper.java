package com.zhangchao.mybatis.mapper;


import com.zhangchao.mybatis.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {
    List<User> getUserList();
}
