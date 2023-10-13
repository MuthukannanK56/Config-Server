package com.example.ConfigServerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.*;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigServerdemoApplication.class, args);
	}

}
