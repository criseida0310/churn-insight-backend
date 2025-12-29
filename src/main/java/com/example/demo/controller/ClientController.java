package com.example.demo.controller;

import com.example.demo.domain.client.Client;
import com.example.demo.domain.client.ClientCreateRequestDTO;
import com.example.demo.service.ClientService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;

    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    // POST /clients
    @PostMapping
    public ResponseEntity<Client> createClient(
            @RequestBody ClientCreateRequestDTO dto) {
        return ResponseEntity.ok(clientService.createFromDto(dto));
    }

    // GET /clients
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientService.getAllClients());
    }
}
