package com.princess.teamconector.repository;


import com.princess.teamconector.models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ManagerRepository extends JpaRepository<Manager, Long> {
    Manager findByUsername(String username);
}
