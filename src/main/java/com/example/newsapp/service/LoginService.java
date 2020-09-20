package com.example.newsapp.service;

import com.example.newsapp.models.User;
import com.example.newsapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UserRepository userRepository;

    public User userEmail(String emailuser){
        return userRepository.findByEmail(emailuser);
    }


}
