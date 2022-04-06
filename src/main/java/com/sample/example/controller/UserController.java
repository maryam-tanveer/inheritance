package com.sample.example.controller;

import com.sample.example.handler.UserHandler;
import com.sample.example.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    private UserHandler userHandler;

    @Autowired
    public UserController(UserHandler userHandler) {
        this.userHandler = userHandler;
    }

    @PostMapping("/save")
    public HttpStatus save(@RequestBody UserModel userModel) {
        userHandler.save(userModel);
        return HttpStatus.OK;
    }
}
