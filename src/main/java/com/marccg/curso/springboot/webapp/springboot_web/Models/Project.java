package com.marccg.curso.springboot.webapp.springboot_web.Models;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.GeneratedValue;

@Entity
public class Project {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Client client;

    @ManyToMany
    private List<User> responsibleUsers;

    @OneToMany(mappedBy = "project")
    private List<Task> tasks;
}
