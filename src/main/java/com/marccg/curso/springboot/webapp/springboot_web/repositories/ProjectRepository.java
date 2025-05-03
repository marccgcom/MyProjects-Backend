package com.marccg.curso.springboot.webapp.springboot_web.repositories;

import com.marccg.curso.springboot.webapp.springboot_web.Models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    
}
