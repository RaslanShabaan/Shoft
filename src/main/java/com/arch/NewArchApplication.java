package com.arch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class NewArchApplication extends SpringBootServletInitializer{

	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(NewArchApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(NewArchApplication.class, args);
	}
	
}
