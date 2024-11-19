package com.java.wellness360;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

//@EnableWebSecurity
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class Wellness360Application {

	public static void main(String[] args) {
		SpringApplication.run(Wellness360Application.class, args);
	}

}
