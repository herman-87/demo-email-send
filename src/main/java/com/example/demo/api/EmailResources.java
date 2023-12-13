package com.example.demo.api;

import com.example.demo.service.EmailService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class EmailResources {
    private final EmailService emailService;

    @PostMapping("/api/message")
    String sendEmailMessage() {
        emailService.sendMessage(
                "wilfriedhanga5@gmail.com",
                "Ceci n'est pas un exercice",
                "Tu as recu ?"
        );
        return "Message sent";
    }
}
