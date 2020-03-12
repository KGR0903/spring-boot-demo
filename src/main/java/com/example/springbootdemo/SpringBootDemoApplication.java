package com.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ContextIdApplicationContextInitializer;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {

		SpringApplication.run(SpringBootDemoApplication.class, args);

	}

}
