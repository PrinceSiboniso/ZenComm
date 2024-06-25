package com.princess.teamconector.controllers;

import com.princess.teamconector.models.Group;
import com.princess.teamconector.models.Message;
import com.princess.teamconector.services.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/manager")
public class ManagerController {

    private static final Logger logger = Logger.getLogger(ManagerController.class.getName());

    @Autowired
    private ManagerService managerService;

    @GetMapping("/groups")
    public List<Group> getGroups(@RequestParam Long managerId) {
        logger.info("Fetching groups for manager ID: " + managerId);
        List<Group> groups = managerService.getManagedGroups(managerId);
        logger.info("Groups found: " + groups.size());
        return groups;
    }

    @GetMapping("/groups/{groupId}/messages")
    public List<Message> getGroupMessages(@PathVariable Long groupId) {
        return managerService.getMessagesByGroup(groupId);
    }

    @PostMapping("/groups/{groupId}/messages")
    public void respondToMessage(@PathVariable Long groupId, @RequestParam Long messageId, @RequestParam String response) {
        managerService.respondToMessage(groupId, messageId, response);
    }
}
