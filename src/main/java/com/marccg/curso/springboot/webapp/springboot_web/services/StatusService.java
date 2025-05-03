package com.marccg.curso.springboot.webapp.springboot_web.services;

import com.marccg.curso.springboot.webapp.springboot_web.Models.Status;
import com.marccg.curso.springboot.webapp.springboot_web.repositories.StatusRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StatusService {

    private final StatusRepository statusRepository;

    public StatusService(StatusRepository statusRepository) {
        this.statusRepository = statusRepository;
    }

    public List<Status> findAll() {
        return statusRepository.findAll();
    }

    public Optional<Status> findById(Long id) {
        return statusRepository.findById(id);
    }

    public Status save(Status status) {
        return statusRepository.save(status);
    }

    public void deleteById(Long id) {
        statusRepository.deleteById(id);
    }
}
