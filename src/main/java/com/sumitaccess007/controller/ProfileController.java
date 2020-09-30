package com.sumitaccess007.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Value("${databasename}")
    private String dbname;

    @Value("${version}")
    private String version;

    @GetMapping("/fetch")
    public String fetchDBDetails() {
        return dbname+" , "+version;
    }

}
