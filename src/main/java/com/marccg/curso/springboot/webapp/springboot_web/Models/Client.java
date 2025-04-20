package com.marccg.curso.springboot.webapp.springboot_web.Models;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;


@Entity
public class Client {
    @Id @GeneratedValue
    private Long id;
    private String name;
}
