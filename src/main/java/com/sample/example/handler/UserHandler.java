package com.sample.example.handler;

import com.sample.example.domain.Landlord;
import com.sample.example.model.UserModel;
import com.sample.example.service.UserService;
import oadd.org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserHandler {


    private final UserService userService;

    @Autowired
    public UserHandler(UserService userService) {
        this.userService = userService;
    }


    public void save(UserModel userModel) {
        userService.save(transformer(userModel));

    }

    private Landlord transformer(UserModel userModel) {
        Landlord landlord = new Landlord();
        landlord.setId(UUID.randomUUID());
        landlord.setAddress(userModel.getAddress());
        landlord.setEmail(userModel.getEmail());
        landlord.setName(userModel.getName());
        landlord.setPhone(userModel.getPhone());
        landlord.setSignUpDate(DateTime.now());
        landlord.setStatus("Active");
        return landlord;


    }
}
