package com.esteban.controladores;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CodingController {

	public static void main(String[] args) {
		SpringApplication.run(CodingController.class, args);
	}
	
    @RequestMapping("/")
    public String inicio() {

            return "Bienvenido";

    }
	
    @RequestMapping("/coding")
    public String hello() {

            return "¡Hola Coding Dojo!";

    }
    
    @RequestMapping("/coding/python")
    public String hello2() {

            return "¡Python/Django fue increíble!";

    }
    
    @RequestMapping("/coding/java")
    public String hello3() {

            return "¡Java/Spring es mejor!";

    }

}
