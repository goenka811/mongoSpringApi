package com.example.mongospringapi;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/policies")
@AllArgsConstructor
public class PolicyController {
    private final PolicyService policyService;

    @GetMapping
    public List<Policy> fetchAllPolicies() {
        return policyService.getAllPolicies();
    }
}
