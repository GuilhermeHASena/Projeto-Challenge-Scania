package br.com.scania;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"br.com.scania.controller,br.com.scania.config"})
public class ScaniaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ScaniaApplication.class, args);
	}

}
