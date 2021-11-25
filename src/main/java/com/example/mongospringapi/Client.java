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

    public Client(String gcmsId, String companyName, String policyContractType, LocalDateTime effectiveFrom, LocalDateTime effectiveTo, List<String> status, LocalDateTime lastmodifiedDate, String lastmodifiedBy, String assignedTo, String assignedBy, String currentAction, String teamId) {
        this.gcmsId = gcmsId;
        this.companyName = companyName;
        this.policyContractType = policyContractType;
        this.effectiveFrom = effectiveFrom;
        this.effectiveTo = effectiveTo;
        this.status = status;
        this.lastmodifiedDate = lastmodifiedDate;
        this.lastmodifiedBy = lastmodifiedBy;
        this.assignedTo = assignedTo;
        this.assignedBy = assignedBy;
        this.currentAction = currentAction;
        this.teamId = teamId;
    }

    private String gcmsId;
    private String companyName;
    private String policyContractType;
    private LocalDateTime effectiveFrom;
    private LocalDateTime effectiveTo;
    private List<String> status;
    private LocalDateTime lastmodifiedDate;
    private String lastmodifiedBy;
    private String assignedTo;
    private String assignedBy;
    private String currentAction;
    private String teamId;

}
