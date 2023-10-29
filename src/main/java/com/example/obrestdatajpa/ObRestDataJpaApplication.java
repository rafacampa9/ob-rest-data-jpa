package com.example.obrestdatajpa;


import com.example.obrestdatajpa.entities.Book;
import com.example.obrestdatajpa.repository.BookRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebMvc;

import java.time.LocalDate;

@SpringBootApplication
public class ObRestDataJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ObRestDataJpaApplication.class, args);
		BookRepository repository = context.getBean(BookRepository.class);

		//CRUD
		// Crear libro
		Book book1 = new Book(null, "La historia de Kento Nanami", "Hitokiri Battosai",
				757, 49.99, LocalDate.of(2023, 02,24), Boolean.TRUE);
		Book book2 = new Book(null, "La historia de Zenin Toji", "Uchiha Madara",
				941, 69.99, LocalDate.of(2023, 05,24), Boolean.TRUE);

		// Almacenar libro
		repository.save(book1);
		repository.save(book2);

		// Recuperar todos los libros
		System.out.println("Número de libros en la base de datos: " +
				repository.findAll().size());

		// Borrar un libro
		//repository.deleteById(1L);
		System.out.println("Número de libros en la base de datos: " +
				repository.findAll().size());

	}


}
