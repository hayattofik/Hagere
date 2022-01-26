package com.hagere.ethiop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(exclude=SecurityAutoConfiguration.class)
@EnableJpaRepositories
public class EthiopApplication {

	public static void main(String[] args) {

		SpringApplication.run(EthiopApplication.class, args);

	}


}
