package com.github.hyagosouzza.seexserver;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.servers.Server;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(title = "Serasa Experian", version = "0"),
		servers = @Server(url = "http://localhost:8080/api")
)
public class SeExServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SeExServerApplication.class, args);
	}

}
