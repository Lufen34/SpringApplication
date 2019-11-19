package com.springapp.SpringApplication;

import com.springapp.SpringApplication.library.Author;
import com.springapp.SpringApplication.library.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
