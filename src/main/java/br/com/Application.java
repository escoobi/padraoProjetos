package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * Projeto Spring boot gerado via initializr.
 * Os seguinte modulos foram selecionados:
 * Spring Data JPA
 * Spring Web
 * H2 Database
 * OpenFeign
 *
 * @author Gustavo Oliveira Cardozo
 *
 */
@EnableFeignClients
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
