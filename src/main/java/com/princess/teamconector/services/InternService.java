package com.princess.teamconector.services;


import com.princess.teamconector.models.Message;
import com.princess.teamconector.repository.InternRepository;
import com.princess.teamconector.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InternService {

    @Autowired
    private InternRepository internRepository;

    @Autowired
    private MessageRepository messageRepository;

    public String getProfile() {
        // Get the logged-in intern's profile
        // (Implement logic to fetch intern profile based on security context)
        return "Intern profile";
    }

    public void sendMessage(String content, boolean anonymous) {
        // Create and save the message
    }

    public List<Message> getMessages() {
        // Fetch and return messages for the logged-in intern
        return null;
    }
}
