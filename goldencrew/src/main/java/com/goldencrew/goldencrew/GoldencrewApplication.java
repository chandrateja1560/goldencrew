package com.goldencrew.goldencrew;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.goldencrew.goldencrew.dao")
public class GoldencrewApplication {

	public static void main(String[] args) {
		SpringApplication.run(GoldencrewApplication.class, args);
	}

}
