package com.br.boilerplate.modules.user.service;

import com.br.boilerplate.modules.user.domain.User;
import com.br.boilerplate.modules.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public User execute(User user) {
        User existUser = userRepository.findByUsername(user.getUsername());

        if(existUser != null) {
            throw new Error ("User already exists");
        }

        return userRepository.save(user);
    }
}
