package com.iaco.screenphrases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenphrasesApplication {

	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(ScreenphrasesApplication.class, args);
	}

}
