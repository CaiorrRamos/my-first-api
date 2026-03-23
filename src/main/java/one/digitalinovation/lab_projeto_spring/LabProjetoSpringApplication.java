package one.digitalinovation.lab_projeto_spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/** Projeto Spring Boot gerado via spring initializr.
 * Seguintes modulos selecionados:
 *  - Spring Data JPA
 *  - Spring Web
 *  - h2 Database
 *  - OpenFeign
 * @author caior
 */
@EnableFeignClients
@SpringBootApplication
public class LabProjetoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(LabProjetoSpringApplication.class, args);
	}

}
