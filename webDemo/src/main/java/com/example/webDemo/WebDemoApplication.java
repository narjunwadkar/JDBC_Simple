package com.example.webDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.example")
public class WebDemoApplication {
	
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	      return application.sources(WebDemoApplication.class);
	   }


	public static void main(String[] args) {
		SpringApplication.run(WebDemoApplication.class, args);
		
		System.out.println("Start....!");
		
	}

}
