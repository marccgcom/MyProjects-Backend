package com.marccg.curso.springboot.webapp.springboot_web.Models;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Task {
    @Id @GeneratedValue
    private Long id;
    private String name;

    @ManyToOne
    private Status status;

    @ManyToOne
    private TaskType taskType;

    private Double scheduledTotalTime;
    private Double realTotalTime;

    @OneToMany(mappedBy = "task")
    private List<TimeRecord> timeRecords;

    @ManyToMany
    private List<User> assignedUsers;

    @ManyToOne
    private Project project;
}
