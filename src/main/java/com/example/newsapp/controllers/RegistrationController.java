package com.example.newsapp.controllers;

import com.example.newsapp.models.Role;
import com.example.newsapp.models.User;
import com.example.newsapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private UserRepository userRepository;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("title", "registration");
        return "registration";
    }

    @PostMapping("/registration")
    public String addUser(User user, Map<String, Object> mod, Model model) {
        User userFromDb = userRepository.findByUsername(user.getUsername());

        if (userFromDb != null) {
            mod.put("message", "User exists!!!");
            return "login";
        }
        user.setActive(true);
        user.setRoles(Collections.singleton(Role.USER));
        model.addAttribute("title", "login");
        userRepository.save(user);
        return "redirect:/login";
    }
}
