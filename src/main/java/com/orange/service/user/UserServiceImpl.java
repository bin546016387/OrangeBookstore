package com.orange.service.user;

import com.orange.dao.mapper.user.UserMapper;
import com.orange.dao.pojo.user.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserMapper userMapper;

    public List<User> searchUser(){
        return userMapper.selectAll();
    }
}
