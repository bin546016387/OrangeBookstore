package com.orange.controller.user;

import com.orange.base.result.Result;
import com.orange.dao.pojo.user.User;
import com.orange.service.user.UserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("/search")
    public Result<?> searchUser() {
        return Result.success(userService.searchUser());
    }


}
