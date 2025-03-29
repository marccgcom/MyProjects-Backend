package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.marccg.curso.springboot.webapp.springboot_web.Models.dto.ParamDto;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@RequestMapping("/api/params")

public class RequestParamController {
    
    @GetMapping("/foo")
    public ParamDto foo(@RequestParam String message) {
        ParamDto param = new ParamDto();
        param.setMessage(message);
        return param;
    }
    
}
