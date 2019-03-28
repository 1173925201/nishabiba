package com.lys.service.impl;

import com.lys.domian.User;
import com.lys.mapper.UserMapper;
import com.lys.service.UserServiceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserServiceMapper {

    @Autowired
    private UserMapper userMapper;


    public User findOne(int id) {
        return userMapper.findOne(id);
    }
}
