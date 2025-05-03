package com.marccg.curso.springboot.webapp.springboot_web.services;

import com.marccg.curso.springboot.webapp.springboot_web.Models.TaskType;
import com.marccg.curso.springboot.webapp.springboot_web.repositories.TaskTypeRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskTypeService {

    private final TaskTypeRepository taskTypeRepository;

    public TaskTypeService(TaskTypeRepository taskTypeRepository) {
        this.taskTypeRepository = taskTypeRepository;
    }

    public List<TaskType> findAll() {
        return taskTypeRepository.findAll();
    }

    public Optional<TaskType> findById(Long id) {
        return taskTypeRepository.findById(id);
    }

    public TaskType save(TaskType task) {
        return taskTypeRepository.save(task);
    }

    public void deleteById(Long id) {
        taskTypeRepository.deleteById(id);
    }
}
