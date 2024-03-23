package com.kamatech.searchgps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SearchGpsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchGpsApplication.class, args);
	}

	@GetMapping
	public String menu() {
		return "<h1>Buscador de Pontos de Interesse por GPS</h1>";
	}

}
