package com.common.study.service;

import com.common.study.domain.User;
import com.common.study.mapper.UserMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;


    public UserService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    public List<User> findUsers() {
        return userMapper.findAll();
    }

}
