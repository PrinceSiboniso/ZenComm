package com.princess.teamconector.controllers;


import com.princess.teamconector.models.Message;
import com.princess.teamconector.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping
    public Message sendMessage(@RequestBody Message message) {
        return messageService.saveMessage(message);
    }

    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }
}


