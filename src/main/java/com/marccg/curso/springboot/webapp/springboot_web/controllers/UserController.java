package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

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

    @GetMapping("/list")
    public String list(ModelMap model) {
        
        model.addAttribute("title", "User List");

        return "list";
    }

    @ModelAttribute("users")
    public List<User> usersModel() {
        List<User> list = new ArrayList<>();
        
        list.add(new User("Marc", "Doe", "marc@controller.com"));
        list.add(new User("Pepito", "Doe"));
        list.add(new User("Pepote", "Doe"));
        
        return list;
    }
}
