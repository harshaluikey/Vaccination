package com.example.Vaccination;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class VaccinationApplication {

	public static void main(String[] args) {
		SpringApplication.run(VaccinationApplication.class, args);
		System.out.println("\n\nVACCINATION APPLIATION STARTED\n\n");
	}

	@GetMapping("/hello")
	public String hellopro(){
		return "VACCINATION PROJECT";
	}

}
