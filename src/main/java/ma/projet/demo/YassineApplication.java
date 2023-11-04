package ma.projet.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "ma.projet.entities")
@EnableJpaRepositories(basePackages = "ma.projet.repositories")
@ComponentScan(basePackages = {"ma.projet.services", "ma.projet.controllers"})
public class YassineApplication {

	public static void main(String[] args) {
		SpringApplication.run(YassineApplication.class, args);
	}

}
