package com.cloud.controller;

import com.cloud.pojo.entity.User;
import com.cloud.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Description 首页
 *
 * @Author daijinming
 * @Date 2019/2/21 15:19
 **/
@RestController
@RequestMapping("/user")
@Api(tags = "用户")

public class UserController {
    @Autowired
    private UserService userService;
    @GetMapping("/")
    @ApiOperation(value = "用户列表")
    public List<User> userList(){
        return userService.list();
    }
}
