package com.example.mongospringapi;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/v1/gcms")
@AllArgsConstructor
public class GcmsController {
    private final GcmsService gcmsService;

    @GetMapping
    public List<Gcms> fetchAllGcms() {
        return gcmsService.getAllGcms();
    }
}
