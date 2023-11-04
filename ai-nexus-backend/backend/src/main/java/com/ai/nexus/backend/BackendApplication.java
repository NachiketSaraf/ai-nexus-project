package com.ai.nexus.backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
<<<<<<< HEAD
=======
import io.swagger.v3.oas.annotations.info.Contact;
>>>>>>> c00b80d (added swagger)
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
