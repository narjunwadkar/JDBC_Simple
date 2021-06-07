package com.example.webDemo;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.example")
public class WebDemoApplication {
	
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = (ApplicationContext) SpringApplication.run(WebDemoApplication.class, args);
		
		SpringApplication.run(WebDemoApplication.class, args);
		
		System.out.println("Start....!");
		
	}

}
