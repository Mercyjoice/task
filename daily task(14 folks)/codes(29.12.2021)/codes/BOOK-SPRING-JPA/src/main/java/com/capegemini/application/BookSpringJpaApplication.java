package com.capegemini.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.capegemini.entity.Book;

@SpringBootApplication
public class BookSpringJpaApplication {

	public static void main(String[] args) {
		Book b = new Book();

		SpringApplication.run(BookSpringJpaApplication.class, args);
	}

}
