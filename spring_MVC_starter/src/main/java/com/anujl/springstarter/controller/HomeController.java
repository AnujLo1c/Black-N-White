package com.anujl.springstarter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/home")
    public String home(Model model) {
        return new String("home");
    }
    @GetMapping("/register")
    public String register(Model model) {
        return "register";
    }
    
    
    
}
