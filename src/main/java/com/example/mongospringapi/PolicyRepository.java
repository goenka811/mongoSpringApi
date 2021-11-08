package com.example.mongospringapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface PolicyRepository extends MongoRepository <Policy,String> {
    Optional<Policy> findPolicyByPolicyNumber(String number);
}
