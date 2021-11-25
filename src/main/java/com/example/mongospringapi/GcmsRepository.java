package com.example.mongospringapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface GcmsRepository extends MongoRepository <Gcms,String> {
   Optional<Gcms> findGcmsByDomicileCodeAndCompanyCode(String id, String id1);

}
