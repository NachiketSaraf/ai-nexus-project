package com.ai.nexus.backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
<<<<<<< HEAD
<<<<<<< HEAD
=======
import io.swagger.v3.oas.annotations.info.Contact;
>>>>>>> e5328a4 (added swagger)
=======
>>>>>>> cc2e4e1 (card)
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "AI Nexus ",
		description = "A Platform where you can find all AI tools as per ur need." ))
public class BackendApplication {
	public static void main(String[] args) {
		SpringApplication.run(BackendApplication.class, args);
	}
}
