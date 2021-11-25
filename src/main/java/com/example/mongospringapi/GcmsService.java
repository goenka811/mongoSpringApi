package com.example.mongospringapi;

import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class GcmsService {

    private final GcmsRepository gcmsRepository;
    private static final Logger LOGGER = LoggerFactory.getLogger(GcmsService.class);
    public List<Gcms> getAllGcms() {
        LOGGER.trace("Entering getAllClients");
        LOGGER.debug("Finding All clients" + "debuglog");
        if(gcmsRepository.findAll() == null){
            LOGGER.error("No Clients found - error");
        }
        LOGGER.info("Gcms found successfully");
        return gcmsRepository.findAll();
    }
}
