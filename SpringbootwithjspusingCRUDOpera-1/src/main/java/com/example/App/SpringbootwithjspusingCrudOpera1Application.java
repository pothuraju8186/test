package com.example.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages={"com.examples"})
public class SpringbootwithjspusingCrudOpera1Application {
	public static void main(String[] args) {		
		SpringApplication.run(SpringbootwithjspusingCrudOpera1Application.class, args);
	}

}
