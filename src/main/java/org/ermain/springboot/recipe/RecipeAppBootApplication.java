package org.ermain.springboot.recipe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableJpaRepositories(basePackages="org.ermain.sprinboot.recipe")
@SpringBootApplication
public class RecipeAppBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecipeAppBootApplication.class, args);
	}
}
