package com.marccg.curso.springboot.webapp.springboot_web.controllers;

import com.marccg.curso.springboot.webapp.springboot_web.Models.Client;
import com.marccg.curso.springboot.webapp.springboot_web.services.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @GetMapping
    public List<Client> getAllClients() {
        return clientService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Client> getClientById(@PathVariable Long id) {
        return clientService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Client createClient(@RequestBody Client client) {
        return clientService.save(client);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Client> updateClient(@PathVariable Long id, @RequestBody Client updatedClient) {
        return clientService.findById(id)
                .map(client -> {
                    client.setName(updatedClient.getName());
                    return ResponseEntity.ok(clientService.save(client));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteClient(@PathVariable Long id) {
        if (clientService.findById(id).isPresent()) {
            clientService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
