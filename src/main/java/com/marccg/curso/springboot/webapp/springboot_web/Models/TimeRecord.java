package com.marccg.curso.springboot.webapp.springboot_web.Models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class TimeRecord {
    @Id @GeneratedValue
    private Long id;
    private LocalDateTime datetime;
    private Double dedicatedHours;

    @ManyToOne
    private Task task;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDatetime() {
        return datetime;
    }

    public void setDatetime(LocalDateTime datetime) {
        this.datetime = datetime;
    }

    public Double getDedicatedHours() {
        return dedicatedHours;
    }

    public void setDedicatedHours(Double dedicatedHours) {
        this.dedicatedHours = dedicatedHours;
    }

    public Task getTask() {
        return task;
    }

    public void setTask(Task task) {
        this.task = task;
    }

    
}
