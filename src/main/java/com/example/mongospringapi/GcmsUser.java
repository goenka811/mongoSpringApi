package com.example.mongospringapi;

import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
@JsonNaming(PropertyNamingStrategy.UpperCamelCaseStrategy.class)
public class GcmsUser {
    @Id
    private String id;

    public GcmsUser(String domicileCode, String domicile, String companyCode, String companyName, String office, String userCode, String name, String eMail, String domicileCompanyRole, String domicileRole, String domicileJob) {
        this.domicileCode = domicileCode;
        this.domicile = domicile;
        this.companyCode = companyCode;
        this.companyName = companyName;
        this.office = office;
        this.userCode = userCode;
        this.name = name;
        this.eMail = eMail;
        this.domicileCompanyRole = domicileCompanyRole;
        this.domicileRole = domicileRole;
        this.domicileJob = domicileJob;
    }

    private String domicileCode;
    private String domicile;
    private String companyCode;
    private String companyName;
    private String office;
    private String userCode;
    private String name;
    private String eMail;
    private String domicileCompanyRole;
    private String domicileRole;
    private String domicileJob;

}
