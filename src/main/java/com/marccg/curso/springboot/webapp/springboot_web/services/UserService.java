package com.marccg.curso.springboot.webapp.springboot_web.services;

import com.marccg.curso.springboot.webapp.springboot_web.Models.User;
import com.marccg.curso.springboot.webapp.springboot_web.repositories.UserRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public Optional<User> findById(Long id) {
        return userRepository.findById(id);
    }

    public User save(User task) {
        return userRepository.save(task);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
