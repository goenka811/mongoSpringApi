package com.example.mongospringapi;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.List;

@Data
@Document
public class Policy {
    @Id
    private String id;
    private String insurerLegalName;
    @Indexed(unique = true)
    private String policyNumber;
    private String coverageType;
    private Address insurerAddress;
    private List<String> currency;
    private BigDecimal insuredPremiumAmount;
    private LocalDateTime termStartDate;
    private LocalDateTime termEndDate;

    public Policy(String insurerLegalName, String policyNumber, String coverageType, Address insurerAddress, List<String> currency, BigDecimal insuredPremiumAmount, LocalDateTime termStartDate, LocalDateTime termEndDate) {
        this.insurerLegalName = insurerLegalName;
        this.policyNumber = policyNumber;
        this.coverageType = coverageType;
        this.insurerAddress = insurerAddress;
        this.currency = currency;
        this.insuredPremiumAmount = insuredPremiumAmount;
        this.termStartDate = termStartDate;
        this.termEndDate = termEndDate;
    }
}
