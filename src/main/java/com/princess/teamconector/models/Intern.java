package com.princess.teamconector.models;


import jakarta.persistence.*;

import java.util.List;

@Entity
public class Intern {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String password;
    private String profile;

    @ManyToMany(mappedBy = "interns")
    private List<Group> groups;

    // Getters and Setters
}
