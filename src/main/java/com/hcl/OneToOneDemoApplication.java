package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OneToOneDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(OneToOneDemoApplication.class, args);
		System.out.println("One to one");
	}

}
