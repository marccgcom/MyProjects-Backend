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
}
