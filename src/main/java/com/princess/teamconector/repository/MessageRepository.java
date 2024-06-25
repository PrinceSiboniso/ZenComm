package com.princess.teamconector.repository;

import com.princess.teamconector.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<Message, Long> {}
