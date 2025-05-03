package com.marccg.curso.springboot.webapp.springboot_web.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marccg.curso.springboot.webapp.springboot_web.Models.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}
