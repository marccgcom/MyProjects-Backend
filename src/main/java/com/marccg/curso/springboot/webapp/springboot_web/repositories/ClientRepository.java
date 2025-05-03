package com.marccg.curso.springboot.webapp.springboot_web.repositories;

import com.marccg.curso.springboot.webapp.springboot_web.Models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
