package com.example.mongospringapi;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document
public class GcmsUser {
    @Id
    private String id;

    public GcmsUser(String domicileCode, String domicile, String companyCode, String companyName, String office, String userCode, String name, String eMail, String domicileCompanyRole, String domicileRole, String domicileJob) {
        DomicileCode = domicileCode;
        Domicile = domicile;
        CompanyCode = companyCode;
        CompanyName = companyName;
        Office = office;
        UserCode = userCode;
        Name = name;
        this.eMail = eMail;
        DomicileCompanyRole = domicileCompanyRole;
        DomicileRole = domicileRole;
        DomicileJob = domicileJob;
    }

    private String DomicileCode;
    private String Domicile;
    private String CompanyCode;
    private String CompanyName;
    private String Office;
    private String UserCode;
    private String Name;
    private String eMail;
    private String DomicileCompanyRole;
    private String DomicileRole;
    private String DomicileJob;

}
