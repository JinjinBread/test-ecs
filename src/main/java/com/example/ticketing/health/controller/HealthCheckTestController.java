package com.example.ticketing.health.controller;

import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Profile("test")
public class HealthCheckTestController {

    @GetMapping("/")
    public String checkHealth() {
        return "test env OK";
    }
}
