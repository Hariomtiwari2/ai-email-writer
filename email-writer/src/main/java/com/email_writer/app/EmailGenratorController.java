package com.email_writer.app;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
public class EmailGenratorController {

    private final EmailGenratorService emailGenratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> genrateEmail(@RequestBody EmailRequest emailRequest) {

        String response = emailGenratorService.genratEmailReply(emailRequest);
        return ResponseEntity.ok(response);

    }

}
