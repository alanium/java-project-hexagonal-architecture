package com.example.springbootapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.example.domain.model")
@EnableJpaRepositories(basePackages = "com.example.infrastructure.adapters.repository")
@ComponentScan(basePackages = "com.example")
public class SpringbootapiApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootapiApplication.class, args);
	}
}
