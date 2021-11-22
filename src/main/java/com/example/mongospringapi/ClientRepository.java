package com.example.mongospringapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface ClientRepository extends MongoRepository <Client,String> {
    Optional<Client> findClientsByClientId(String id);
}
