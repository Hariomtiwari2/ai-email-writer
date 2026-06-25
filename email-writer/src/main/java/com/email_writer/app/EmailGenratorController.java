package com.email_writer.app;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
public class EmailGenratorController {

    private final EmailGenratorService emailGenratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> genrateEmail(@RequestBody EmailRequest emailRequest) {

        String response = emailGenratorService.genratEmailReply(emailRequest);
        return ResponseEntity.ok(response);

    }

}
