package com.example.mongospringapi;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class ClientService {

    private final ClientRepository clientRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(ClientService.class);
    public List<Client> getAllClients() {
        LOGGER.trace("Entering getAllClients");
        LOGGER.debug("Finding All clients" + "debuglog");
        if(clientRepository.findAll() == null){
            LOGGER.error("No Clients found - error");
        }
        LOGGER.info("Clients found successfully");
        return clientRepository.findAll();
    }
}
