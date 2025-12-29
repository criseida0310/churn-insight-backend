package com.example.demo.domain.service;

import com.example.demo.domain.user.Client;
import com.example.demo.domain.user.ClientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client saveClient(Client client) {
        return clientRepository.save(client);
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
public Client createFromDto(ClientCreateRequestDTO dto) {
    Client client = new Client();
    client.setClientName(dto.getClientName());
    client.setEmail(dto.getEmail());
    client.setActive(dto.getActive());
    client.setSubscriptionDate(dto.getSubscriptionDate());
    client.setGender(dto.getGender());
    client.setPhoneRegistered(dto.getPhoneRegistered());
    client.setNearCity(dto.getNearCity());
    client.setAge(dto.getAge());

    return clientRepository.save(client);
}
