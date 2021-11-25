package com.example.mongospringapi;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface GcmsUserRepository extends MongoRepository <GcmsUser,String> {
   Optional<GcmsUser> findGcmsUserByDomicileCodeAndCompanyCode(String id, String id1);
   List<GcmsUser> findGcmsUserByUserCodeContains(String id);

}
