package br.edu.atitus.atitusound.configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class ConfigSwagger {
	
	@Bean
	public OpenAPI getOpenAPI() {
		return new OpenAPI()
				.info(new Info()
						.title("API AtituSound")
						.description("Documentação BackEnd AtituSound")
						.version("Version 1.0.0")
						.contact(new Contact()
								.name("Desenvolvido por Nycolas Musskopf Fachi")
								.email("nycomf@hotmail.com")));
				
	}

}
