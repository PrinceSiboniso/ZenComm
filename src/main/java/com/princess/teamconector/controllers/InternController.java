package com.princess.teamconector.controllers;
import com.princess.teamconector.models.Message;
import com.princess.teamconector.services.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/intern")
public class InternController {

    @Autowired
    private InternService internService;

    @GetMapping("/profile")
    public String getProfile() {
        return internService.getProfile();
    }

    @PostMapping("/messages")
    public void sendMessage(@RequestParam String content, @RequestParam boolean anonymous) {
        internService.sendMessage(content, anonymous);
    }

    @GetMapping("/messages")
    public List<Message> getMessages() {
        return internService.getMessages();
    }
}
