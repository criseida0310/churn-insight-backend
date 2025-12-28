package com.example.demo.controller;

import com.example.demo.domain.client.ClientCreateRequestDTO;
import com.example.demo.domain.user.Client;
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

    // POST - crear cliente usando DTO
    @PostMapping
    public ResponseEntity<Client> createClient(
            @RequestBody ClientCreateRequestDTO dto) {

        Client client = clientService.createFromDto(dto);
        return ResponseEntity.ok(client);
    }

    // GET - listar clientes
    @GetMapping
    public ResponseEntity<List<Client>> getAllClients() {
        return ResponseEntity.ok(clientService.getAllClients());
    }
}
