package com.backend.willfree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.backend.willfree.controller","com.backend.willfree.entity","com.backend.willfree.repository","com.backend.willfree.service","com.backend.willfree.configs"})
public class WillFreeApplication {
	public static void main(String[] args) {
		SpringApplication.run(WillFreeApplication.class, args);
	}

}
