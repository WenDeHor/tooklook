package com.example.newsapp.controllers;

import com.example.newsapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageControllers {

    @GetMapping("/photoPage")
    public String photoPage(Model model) {
        model.addAttribute("title", "Gallery");
        return "photoPage";
    }


}
