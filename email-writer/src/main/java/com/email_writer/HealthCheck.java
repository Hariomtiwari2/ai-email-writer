package com.email_writer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheck {

    @GetMapping("/health-check")
    public String health() {
        return "Everything is fine";
    }

}
