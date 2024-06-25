package com.princess.teamconector.repository;

import com.princess.teamconector.models.Group;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {
    List<Group> findByManagerId(Long managerId);
}
