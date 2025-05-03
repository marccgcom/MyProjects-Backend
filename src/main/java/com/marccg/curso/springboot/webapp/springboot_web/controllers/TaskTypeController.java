package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marccg.curso.springboot.webapp.springboot_web.Models.TaskType;
import com.marccg.curso.springboot.webapp.springboot_web.services.TaskTypeService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;




@RestController
@RequestMapping("/api/task_types")
public class TaskTypeController {
    
    private final TaskTypeService taskTypeService;

    public TaskTypeController(TaskTypeService taskTypeService) {
        this.taskTypeService = taskTypeService;
    }

    @GetMapping
    public List<TaskType> getAllTasksTypes() {
        return taskTypeService.findAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<TaskType> getTaskTypeById(@PathVariable Long id) {
        return taskTypeService.findById(id)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public TaskType createTaskType(@RequestBody TaskType status) {
        return taskTypeService.save(status);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskType> updateTaskType(@PathVariable Long id, @RequestBody TaskType updatedTask) {
        return taskTypeService.findById(id).map(task -> {
            task.setName(updatedTask.getName());
            return ResponseEntity.ok(taskTypeService.save(task));
        })
        .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteTaskType(@PathVariable Long id) {
        if (taskTypeService.findById(id).isPresent()) {
            taskTypeService.deleteById(id);
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
    


}
