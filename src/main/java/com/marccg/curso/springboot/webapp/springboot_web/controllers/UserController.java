package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.marccg.curso.springboot.webapp.springboot_web.Models.User;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("Marc", "CG");
        model.addAttribute("title", "Hola  mundo spring boot");
        model.addAttribute("user", user);
        return "details";
    }
}
