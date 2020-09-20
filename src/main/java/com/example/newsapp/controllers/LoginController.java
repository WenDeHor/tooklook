package com.example.newsapp.controllers;


import com.example.newsapp.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    public String getLoginPage(Authentication authentication, ModelMap model, HttpServletRequest request) {

        if (request.getParameterMap().containsKey("error")||request.getParameterMap().containsKey("")) {
            model.addAttribute("error", true);
        }
        return "redirect:/";
    }

}
