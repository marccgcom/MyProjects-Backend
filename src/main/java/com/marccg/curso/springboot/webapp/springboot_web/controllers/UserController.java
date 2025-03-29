package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {
    
    @GetMapping("/details")
    public String details(Map<String, Object> model) {
        model.put("title", "Hola  mundo spring boot");
        model.put("name", "Marc");
        model.put("lastname", "CG");
        return "details";
    }
}
