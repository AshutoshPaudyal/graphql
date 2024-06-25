package com.example.dgs.demo;


import com.example.dgs.demo.entities.Book;
import com.example.dgs.demo.repositories.BookRepo;



import graphql.Scalars;


import org.springframework.boot.web.servlet.ServletRegistrationBean;


import graphql.schema.GraphQLSchema;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
public class DgsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DgsDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(BookRepo repo) {

		return args -> {

			Book b1 = new Book("Porter", "This is Porter", "Ram", 12000, 500);
			repo.save(b1);

			Book b2 = new Book("Harry", "This is Harry", "Shyam", 15000, 200);
			repo.save(b2);

			Book b3 = new Book("Walter", "This is Walter", "Hari", 17000, 700);
			repo.save(b3);
		};


	}


//	@Bean
//	GraphQLSchema schema() {
//		return GraphQLSchema.newSchema()
//				.query(GraphQLObjectType.newObject()
//						.name("query")
//						.field(field -> field
//								.name("test")
//								.type(Scalars.GraphQLString)
//								.dataFetcher(environment -> "response")
//						)
//						.build())
//				.build();
//
//
//	}
}
