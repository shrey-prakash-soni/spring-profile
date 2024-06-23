package com.example.learn.spring_profile;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringProfileApplication implements CommandLineRunner {

	private final ApplicationConfig applicationConfig;

	public SpringProfileApplication(ApplicationConfig applicationConfig) {
		this.applicationConfig = applicationConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringProfileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(applicationConfig.toString());
	}
}
