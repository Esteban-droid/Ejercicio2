package com.esteban.demo;
import static org.junit.Assert.*;
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

    @Autowired // inyectará el controlador en la clase sin la necesidad de escribir el constructor

    // use the name of the controller you create in your project
/*
    private BooksController controller;

    @Test

    void contextLoads() {

    }

    @Test

    void testController() {

        assertThat(controller).isNotNull();  //Esto verificará que el controlador se haya inyectado correctamente en la clase.

    }
  */  
    //-----------------------------------------------------------
    
    private static Validator validator;
    
    @BeforeAll //se aplica a este método para que el objeto Validador esté disponible para cualquier método de la clase que necesite usarlo

    static void setUp() {

        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();

        validator = factory.getValidator();

    }
    /*
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
*/
	
	//--------------testeo de titulo de libro--------------
	/*
	@Test

	void assumeTitleIsNull() {

	    Book book = new Book();

	    book.setDescription("Great Book");

	    book.setLanguage("English");

	    book.setNumberOfPages(734);

	    Set<ConstraintViolation<Book>> violations = validator.validate(book);

	    assertTrue(violations.isEmpty());

	}
*/
	//--------------testeo de autores-----------------------
    
    @Test
    public void autorPresente() {
    	Autor autor = new Autor();
    	autor.setNombre("Esteban");
    	String nombre = autor.getNombre();
    	assertNotNull(nombre);
    }
    
    @Test
    public void autorCaracteres() {
    	Autor autor = new Autor();
    	autor.setNombre("D");
    	Set<ConstraintViolation<Autor>> violations = validator.validate(autor);
        for (ConstraintViolation<Autor> violation : violations) {
            System.out.println(violation.getMessage()); 
        }
        assertFalse(violations.isEmpty());
    }
    
    //--------------------------------------------------------------------------
    
    @Test
    public void apellidoPresente() {
    	Autor autor = new Autor();
    	autor.setApellido("Mora");
    	String apellido = autor.getApellido();
    	assertNotNull(apellido);
    }
    
    @Test
    public void apellidoCaracteres() {
    	Autor autor = new Autor();
    	autor.setApellido("Mora");
    	Set<ConstraintViolation<Autor>> violations = validator.validate(autor);
        for (ConstraintViolation<Autor> violation : violations) {
            System.out.println(violation.getMessage()); 
        }
        assertFalse(violations.isEmpty());
    }
    
    //--------------------------------------------------------------------------

    @Test
    public void descPresente() {
    	Autor autor = new Autor();
    	autor.setDescripcion("Esta es una descripcion");
    	String descripcion = autor.getDescripcion();
    	assertNotNull(descripcion);
    }
    
    @Test
    public void descCaracteres() {
    	Autor autor = new Autor();
    	autor.setDescripcion("descripcion");
    	Set<ConstraintViolation<Autor>> violations = validator.validate(autor);
        for (ConstraintViolation<Autor> violation : violations) {
            System.out.println(violation.getMessage()); 
        }
        assertFalse(violations.isEmpty());
    }
}
