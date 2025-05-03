package com.marccg.curso.springboot.webapp.springboot_web.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.marccg.curso.springboot.webapp.springboot_web.Models.Project;
import com.marccg.curso.springboot.webapp.springboot_web.repositories.ProjectRepository;

@Service
public class ProjectService {

    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }

    public List<Project> findAll() {
        return projectRepository.findAll();
    }

    public Optional<Project> findById(Long id){
        return projectRepository.findById(id);
    }

    public Project save(Project project) {
        return projectRepository.save(project);
    }

    public void deleteById(Long id){
        projectRepository.deleteById(id);
    }
    
}
