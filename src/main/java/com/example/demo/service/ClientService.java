package com.example.demo.service;

import com.example.demo.domain.client.Client;
import com.example.demo.domain.client.ClientCreateRequestDTO;
import com.example.demo.domain.client.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    // Crear cliente desde DTO
    public Client createFromDto(ClientCreateRequestDTO dto) {
        Client client = new Client();
        client.setPlan(dto.getPlan());
        client.setFechaAlta(dto.getFechaAlta());
        return clientRepository.save(client);
    }

    // Listar todos los clientes
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
