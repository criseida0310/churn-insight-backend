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

    // Crear cliente desde DTO (sin churn)
    public Client createFromDto(ClientCreateRequestDTO dto) {
        Client client = new Client();

        client.setClientName(dto.getClientName());
        client.setGender(dto.getGender());
        client.setNearLocation(dto.getNearLocation());
        client.setPartnerEmployee(dto.getPartnerEmployee());
        client.setPromoFriends(dto.getPromoFriends());
        client.setClientPhone(dto.getClientPhone());
        client.setAge(dto.getAge());
        client.setContractPeriod(dto.getContractPeriod());
        client.setMonthToEndContract(dto.getMonthToEndContract());
        client.setLifetimeMonths(dto.getLifetimeMonths());
        client.setAvgClassFrequencyTotal(dto.getAvgClassFrequencyTotal());
        client.setAvgClassFrequencyCurrentMonth(dto.getAvgClassFrequencyCurrentMonth());

        // churn NO se setea aquí (lo calcula el modelo)
        return clientRepository.save(client);
    }

    // Listar todos los clientes
    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }
}
