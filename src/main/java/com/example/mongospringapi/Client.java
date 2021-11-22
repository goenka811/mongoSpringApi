package com.example.mongospringapi;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class Client {
    @Id
    private String id;
    private String clientId;
    private String clientName;
    private String insuranceType;
    private LocalDateTime createdDate;
    private LocalDateTime expirationDate;
    private List<String> status;
    private LocalDateTime modifiedDate;

    public Client(String clientId, String clientName, String insuranceType, LocalDateTime createdDate, LocalDateTime expirationDate, List<String> status, LocalDateTime modifiedDate) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.insuranceType = insuranceType;
        this.createdDate = createdDate;
        this.expirationDate = expirationDate;
        this.status=status;
        this.modifiedDate = modifiedDate;
    }
}
