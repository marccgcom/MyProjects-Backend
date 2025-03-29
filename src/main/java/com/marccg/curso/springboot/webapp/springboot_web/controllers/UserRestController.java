package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
    
    @GetMapping("/details-rest")
    public Map<String, Object> details() {
        Map<String, Object> response = new HashMap<>();

        response.put("title", "Hola  mundo spring boot");
        response.put("name", "Marc");
        response.put("lastname", "CG");
        return response;
    }
}
