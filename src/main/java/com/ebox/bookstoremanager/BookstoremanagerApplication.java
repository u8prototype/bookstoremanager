package com.ebox.bookstoremanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class BookstoremanagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoremanagerApplication.class, args);
	}

}
