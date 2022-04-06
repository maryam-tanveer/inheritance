package com.sample.example.service;

import com.sample.example.domain.Landlord;
import com.sample.example.domain.User;
import com.sample.example.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void save(Landlord landlord) {
        userRepository.save(landlord);

    }
}
