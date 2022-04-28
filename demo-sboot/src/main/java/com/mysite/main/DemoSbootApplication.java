package com.mysite.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan("com.mysite.main")
@SpringBootApplication
@EnableJpaRepositories("com.mysite.main")
public class DemoSbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSbootApplication.class, args);
	}

}