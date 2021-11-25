package com.example.mongospringapi;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class GcmsUserService {

    private final GcmsUserRepository gcmsUserRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(GcmsUserService.class);
    public List<GcmsUser> getAllGcmsUser() {
        LOGGER.trace("Entering getAllClients");
        LOGGER.debug("Finding All clients" + "debuglog");
        if(gcmsUserRepository.findAll() == null){
            LOGGER.error("No Clients found - error");
        }
        LOGGER.info("Gcms found successfully");
        return gcmsUserRepository.findAll();
    }
    public List<GcmsUser> getGcmsUser(String user) {
        LOGGER.trace("Entering getAllClients");
        LOGGER.debug("Finding All clients" + "debuglog");
        if(gcmsUserRepository.findGcmsUserByUserCodeContains(user) == null){
            LOGGER.error("No Clients found - error");
        }
        LOGGER.info("Gcms found successfully");
        return gcmsUserRepository.findGcmsUserByUserCodeContains(user);
    }
}
