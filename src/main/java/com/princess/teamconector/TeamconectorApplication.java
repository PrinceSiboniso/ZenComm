package com.princess.teamconector;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.princess.teamconector.models"})
@EnableJpaRepositories(basePackages = {"com.princess.teamconector.repository"})
public class TeamconectorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeamconectorApplication.class, args);
	}
}
