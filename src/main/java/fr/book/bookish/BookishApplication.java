package fr.book.bookish;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"controller"})
public class BookishApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookishApplication.class, args);
	}

}
