package com.example.newsapp.controllers;

import com.example.newsapp.forms.UserForm;
import com.example.newsapp.service.SignUpService;
import com.example.newsapp.service.SignUpServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

    private final SignUpServiceImpl service;

    public SignUpController(SignUpServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/signUp")
    public String getSignUpPage() {
        return "signUp";
    }

    @PostMapping("/signUp")
    public String signUp(UserForm userForm) {
        service.signUp(userForm);
        return "redirect:/login";
    }
}
