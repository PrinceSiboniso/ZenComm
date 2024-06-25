package com.princess.teamconector.services;

import com.princess.teamconector.models.Group;
import com.princess.teamconector.models.Message;
import com.princess.teamconector.repository.GroupRepository;
import com.princess.teamconector.repository.ManagerRepository;
import com.princess.teamconector.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManagerService {

    @Autowired
    private ManagerRepository managerRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private MessageRepository messageRepository;

    public List<Group> getManagedGroups(Long managerId) {
        return managerRepository.findById(managerId).orElseThrow().getGroups();
    }

    public List<Message> getMessagesByGroup(Long groupId) {
        return groupRepository.findById(groupId).orElseThrow().getMessages();
    }

    public void respondToMessage(Long groupId, Long messageId, String response) {
        Message message = messageRepository.findById(messageId).orElseThrow();
        // Here you can set the response, e.g., create a new message or update the existing one
        // For simplicity, let's assume you just update the content of the existing message
        message.setContent(response);
        messageRepository.save(message);
    }
}

