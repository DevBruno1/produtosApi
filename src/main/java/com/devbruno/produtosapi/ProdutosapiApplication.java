package com.devbruno.produtosapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class ProdutosapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutosapiApplication.class, args);
	}

}
