package com.bridgelabz.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.bridgelabz.bookstore"})

@SpringBootApplication
@EnableAutoConfiguration
public class BookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
		
	}

}
