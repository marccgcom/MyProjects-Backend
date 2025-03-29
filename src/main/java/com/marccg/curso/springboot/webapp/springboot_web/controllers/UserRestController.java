package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marccg.curso.springboot.webapp.springboot_web.Models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @RequestMapping(path="/details", method=RequestMethod.GET)
    public Map<String, Object> details() {
        User user = new User("Marc", "CG");
        Map<String, Object> response = new HashMap<>();

        response.put("title", "Hola  mundo spring boot");
        response.put("user", user);
        return response;
    }
}
