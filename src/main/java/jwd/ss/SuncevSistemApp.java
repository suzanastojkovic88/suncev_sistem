package jwd.ss;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class SuncevSistemApp 
	extends SpringBootServletInitializer {
	
	@SuppressWarnings("unused")
	@Autowired 
	private Test test;

	public static void main(String[] args) {
		 SpringApplication.run(SuncevSistemApp.class, args);
	}

}
