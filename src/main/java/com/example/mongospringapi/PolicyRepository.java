package com.example.mongospringapi;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface PolicyRepository extends MongoRepository <Policy,String> {
}
