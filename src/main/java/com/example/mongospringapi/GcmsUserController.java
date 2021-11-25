package com.example.mongospringapi;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/gcmsUsers")
@AllArgsConstructor
public class GcmsUserController {
    private final GcmsUserService gcmsUserService;

    @GetMapping
    public List<GcmsUser> fetchAllGcmsUser() {
        return gcmsUserService.getAllGcmsUser();
    }

    @GetMapping("/1")
    public List<GcmsUser> fetchAllGcmsUser1(String USER_CODE) {
        System.out.println("USER_CODE"+USER_CODE);
        return gcmsUserService.getGcmsUser(USER_CODE);
    }
}
