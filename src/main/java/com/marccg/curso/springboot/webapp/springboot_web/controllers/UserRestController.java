package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.marccg.curso.springboot.webapp.springboot_web.Models.User;
import com.marccg.curso.springboot.webapp.springboot_web.Models.dto.UserDto;

@RestController
@RequestMapping("/api")
public class UserRestController {
    
    @RequestMapping(path="/details", method=RequestMethod.GET)
    public UserDto details() {
        User user = new User("Marc", "CG");
        UserDto userDto = new UserDto("Title Spring Boot", user);
        return userDto;
    }
}
