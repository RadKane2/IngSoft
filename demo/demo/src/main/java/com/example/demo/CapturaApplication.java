package com.example.demo;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.boot.SpringApplication.run;

@SuppressWarnings("unused")
@SpringBootApplication
public class CapturaApplication {

	public static void main(String[] args) {
		run(CapturaApplication.class, args);
	}

}

