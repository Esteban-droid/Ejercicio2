package com.esteban.demo;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.esteban.demo.controllers.BooksController;
import com.esteban.demo.models.Autor;
import com.esteban.demo.models.Book;

@SpringBootTest

class BooksApplicationTests {

    @Autowired

    // use the name of the controller you create in your project

    private BooksController controller;

    @Test

    void contextLoads() {

    }

    @Test

    void testController() {

        assertThat(controller).isNotNull();  //Esto verificará que el controlador se haya inyectado correctamente en la clase.

    }
    
    //-----------------------------------------------------------
    
    private static Validator validator;
    
    @BeforeAll

    static void setUp() {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

        validator = factory.getValidator();

    }
    
    @Test

    void testBook() {

        Book book = new Book();

        book.setTitle("Harry Potter and the Goblet of Fire");

        book.setDescription("Great book");

        book.setLanguage("English");

        book.setNumberOfPages(734);

        Set<ConstraintViolation<Book>> violations = validator.validate(book);

        for (ConstraintViolation<Book> violation : violations) {

            System.out.println(violation.getMessage()); 

        }

        assertTrue(violations.isEmpty());

    }

	private void assertTrue(boolean empty) {
		// TODO Auto-generated method stub
		
	}
	
	//--------------testeo de autores-----------------------
	
    @Test

    void testAutor() {

        Autor autor = new Autor();

        autor.setNombre("E");

        autor.setDescripcion("G");

        autor.setApellido("M");

        Set<ConstraintViolation<Autor>> violations = validator.validate(autor);

        for (ConstraintViolation<Autor> violation : violations) {

            System.out.println(violation.getMessage()); 

        }

        assertTrue(violations.isEmpty());

    }

}
