package com.example.mongospringapi;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class Gcms {
    @Id
    private String id;

    public Gcms(String domicileCode, String domicile, String companyCode, String companyName, String companyType, String industry, String division, String divisionName) {
        this.domicileCode = domicileCode;
        this.domicile = domicile;
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.companyType = companyType;
        this.industry = industry;
        this.division = division;
        this.divisionName = divisionName;
    }
    //@JsonProperty("DomicileCode")
    private String domicileCode;
    private String domicile;
    private String companyCode;
    private String companyName;
    private String companyType;
    private String industry;
    private String division;
    private String divisionName;
}
