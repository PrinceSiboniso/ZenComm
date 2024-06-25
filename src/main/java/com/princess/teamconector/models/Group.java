package com.princess.teamconector.models;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToOne
    private Manager manager;

    @ManyToMany
    private List<Intern> interns;

    @OneToMany(mappedBy = "group")
    private List<Message> messages;

    // Constructors, Getters, and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }

    public List<Intern> getInterns() {
        return interns;
    }

    public void setInterns(List<Intern> interns) {
        this.interns = interns;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }
}
