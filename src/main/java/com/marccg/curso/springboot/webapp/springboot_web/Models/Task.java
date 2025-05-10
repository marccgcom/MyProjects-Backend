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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public TaskType getTaskType() {
        return taskType;
    }

    public void setTaskType(TaskType taskType) {
        this.taskType = taskType;
    }

    public Double getScheduledTotalTime() {
        return scheduledTotalTime;
    }

    public void setScheduledTotalTime(Double scheduledTotalTime) {
        this.scheduledTotalTime = scheduledTotalTime;
    }

    public Double getRealTotalTime() {
        return realTotalTime;
    }

    public void setRealTotalTime(Double realTotalTime) {
        this.realTotalTime = realTotalTime;
    }

    public List<TimeRecord> getTimeRecords() {
        return timeRecords;
    }

    public void setTimeRecords(List<TimeRecord> timeRecords) {
        this.timeRecords = timeRecords;
    }

    public List<User> getAssignedUsers() {
        return assignedUsers;
    }

    public void setAssignedUsers(List<User> assignedUsers) {
        this.assignedUsers = assignedUsers;
    }

    
}
