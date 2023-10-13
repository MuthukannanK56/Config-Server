package com.example.ConfigServerClientDemo;

import org.springframework.beans.factory.annotation.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.*;

@SpringBootApplication
@RefreshScope
public class ConfigServerClientDemoApplication {
@Autowired
private DemoController demoController;
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerClientDemoApplication.class, args);
	}

}
