package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hola  mundo spring boot");
        model.addAttribute("name", "Marc");
        model.addAttribute("lastname", "CG");
        return "details";
    }
}
