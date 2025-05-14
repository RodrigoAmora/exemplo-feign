package br.com.rodrigoamora;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ExemploFeignApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExemploFeignApplication.class, args);
	}

}
