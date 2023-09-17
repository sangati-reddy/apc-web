package com.sangati;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StartApplication extends SpringBootServletInitializer {

    @GetMapping("/")
    public String index(final Model model) {
       
        return "Welcome Spring Boot Application. Welcome";
    }

    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
    
    @RequestMapping(value = "/hello")
	public String helloWorld()
	{
		return "Hello World";
	}

}
