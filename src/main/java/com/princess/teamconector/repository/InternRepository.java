package com.princess.teamconector.repository;

import com.princess.teamconector.models.Intern;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InternRepository extends JpaRepository<Intern, Long> {
    Intern findByUsername(String username);
}
