package com.ai.nexus.backend;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
<<<<<<< HEAD
=======
import io.swagger.v3.oas.annotations.info.Contact;
>>>>>>> e5328a4 (added swagger)
=======
>>>>>>> cc2e4e1 (card)
=======
=======
import io.swagger.v3.oas.annotations.info.Contact;
>>>>>>> c00b80d (added swagger)
>>>>>>> 7e117bd (added swagger)
=======
=======
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
=======
import io.swagger.v3.oas.annotations.info.Contact;
>>>>>>> c00b80d (added swagger)
=======
>>>>>>> 9ea63d0 (card)
<<<<<<< HEAD
>>>>>>> 5550945 (card)
=======
>>>>>>> 9b189274921630aa7ecf29b36c938ddd0bec19f3
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
